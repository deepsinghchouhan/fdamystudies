INSERT INTO `users` (`user_id`, `first_name`, `last_name`, `email`, `password`,	`phone_number`, `role_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `access_code`, `accountNonExpired`, `accountNonLocked`, `credentialsNonExpired`, `password_expairded_datetime`, `security_token`, `token_expiry_date`, `token_used`, `force_logout`, `user_login_datetime`, `email_changed`, `access_level`) VALUES (1, 'Account', 'Manager', 'superadmin@gmail.com', '$2a$10$u9g0amp4vMlEZrfnfH/hBeqXZx9psguQeMb4nzIn798MF2/L51HTi', '333-333-3355', 1, 1, '2018-01-18 14:36:41', 47, '2018-01-18 15:42:55', 1, 'ja67Ll', 1, 1, 1, '2021-1-09 10:32:48', 'N8K7zYrc0F', '2020-06-07 19:01:14', 0, 'N', '2020-01-25 19:01:14', 0, NULL);

INSERT INTO `user_permissions` (`permission_id`, `permissions`) VALUES (8, 'ROLE_CREATE_MANAGE_STUDIES'), (6, 'ROLE_MANAGE_APP_WIDE_NOTIFICATION_EDIT'), (4, 'ROLE_MANAGE_APP_WIDE_NOTIFICATION_VIEW'), (2, 'ROLE_MANAGE_STUDIES'), (5, 'ROLE_MANAGE_USERS_EDIT'), (7, 'ROLE_MANAGE_USERS_VIEW'), (1, 'ROLE_SUPERADMIN');