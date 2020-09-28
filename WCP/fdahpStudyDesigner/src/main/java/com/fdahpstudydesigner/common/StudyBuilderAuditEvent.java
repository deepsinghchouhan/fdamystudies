/*
 * Copyright 2020 Google LLC
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package com.fdahpstudydesigner.common;

import static com.fdahpstudydesigner.common.PlatformComponent.STUDY_BUILDER;
import static com.fdahpstudydesigner.common.PlatformComponent.STUDY_DATASTORE;

import lombok.Getter;

@Getter
public enum StudyBuilderAuditEvent {
  USER_SIGNOUT_SUCCEEDED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "USER_SIGNOUT_SUCCEEDED"),

  USER_SIGNOUT_FAILED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "USER_SIGNOUT_FAILED"),

  STUDY_NEW_NOTIFICATION_CREATED(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "New notification created (notification ID - ${notification_id}).",
      "STUDY_NEW_NOTIFICATION_CREATED"),

  STUDY_NOTIFICATION_SAVED_OR_UPDATED(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "Notification saved/updated (notification ID - ${notification_id}).",
      "STUDY_NOTIFICATION_SAVED_OR_UPDATED"),

  STUDY_NOTIFICATION_MARKED_COMPLETE(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "Notification marked done/complete (notification ID - ${notification_id}).",
      "STUDY_NOTIFICATION_MARKED_COMPLETE"),

  APP_LEVEL_NOTIFICATION_LIST_VIEWED(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "APP_LEVEL_NOTIFICATION_LIST_VIEWED"),

  APP_LEVEL_NOTIFICATION_CREATED(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "App-level notification created. Notification ID : '${notification_id}'",
      "APP_LEVEL_NOTIFICATION_CREATED"),

  APP_LEVEL_NOTIFICATION_REPLICATED_FOR_RESEND(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "App-level notification replicated for resend, by user. Existing notification ID : '${old_notification_id}', new notification ID : '${new_notification_id}'.",
      "APP_LEVEL_NOTIFICATION_REPLICATED_FOR_RESEND"),

  PASSWORD_CHANGE_SUCCEEDED(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "PASSWORD_CHANGE_SUCCEEDED"),

  PASSWORD_CHANGE_FAILED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "PASSWORD_CHANGE_FAILED"),

  USER_ACCOUNT_UPDATED(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "Account details updated in My Account section.",
      "USER_ACCOUNT_UPDATED"),

  USER_ACCOUNT_UPDATED_FAILED(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "Attempt to update account details failed for user in My Account section.",
      "USER_ACCOUNT_UPDATED_FAILED"),

  ACCOUNT_DETAILS_VIEWED(
      STUDY_BUILDER,
      STUDY_DATASTORE,
      null,
      "Account details viewed in My Account section.",
      "ACCOUNT_DETAILS_VIEWED"),

  STUDY_CONSENT_SECTIONS_MARKED_COMPLETE(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_CONSENT_SECTIONS_MARKED_COMPLETE"),

  STUDY_NOTIFICATIONS_SECTION_MARKED_COMPLETE(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_NOTIFICATIONS_SECTION_MARKED_COMPLETE"),

  STUDY_QUESTIONNAIRES_SECTION_MARKED_COMPLETE(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_QUESTIONNAIRES_SECTION_MARKED_COMPLETE"),

  STUDY_RESOURCE_SECTION_MARKED_COMPLETE(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_RESOURCE_SECTION_MARKED_COMPLETE"),

  NEW_STUDY_CREATION_INITIATED(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "NEW_STUDY_CREATION_INITIATED"),

  LAST_PUBLISHED_VERSION_OF_STUDY_VIEWED(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "LAST_PUBLISHED_VERSION_OF_STUDY_VIEWED"),

  STUDY_VIEWED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_VIEWED"),

  STUDY_ACCESSED_IN_EDIT_MODE(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_ACCESSED_IN_EDIT_MODE"),

  STUDY_LAUNCHED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_LAUNCHED"),

  STUDY_PUBLISHED_AS_UPCOMING_STUDY(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_PUBLISHED_AS_UPCOMING_STUDY"),

  UPDATES_PUBLISHED_TO_STUDY(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "UPDATES_PUBLISHED_TO_STUDY"),

  STUDY_PAUSED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_PAUSED"),

  STUDY_RESUMED(STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_RESUMED"),

  STUDY_SETTINGS_SAVED_OR_UPDATED(
      STUDY_BUILDER, STUDY_DATASTORE, null, null, "STUDY_SETTINGS_SAVED_OR_UPDATED");

  private final PlatformComponent source;
  private final PlatformComponent destination;
  private final PlatformComponent resourceServer;
  private final String description;
  private final String eventCode;

  StudyBuilderAuditEvent(
      PlatformComponent source,
      PlatformComponent destination,
      PlatformComponent resourceServer,
      String description,
      String eventCode) {
    this.source = source;
    this.destination = destination;
    this.resourceServer = resourceServer;
    this.description = description;
    this.eventCode = eventCode;
  }
}
