/*
 * Copyright 2020 Google LLC
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package com.google.cloud.healthcare.fdamystudies.beans;

import java.util.ArrayList;
import java.util.List;

import com.google.cloud.healthcare.fdamystudies.common.ErrorCode;
import com.google.cloud.healthcare.fdamystudies.common.MessageCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocationResponse extends BaseResponse {

  private List<LocationDetails> locations = new ArrayList<>();

  public LocationResponse(ErrorCode errorCode) {
    super(errorCode);
  }

  public LocationResponse(MessageCode messageCode, List<LocationDetails> locations) {
    super(messageCode);
    this.locations.addAll(locations);
  }
}
