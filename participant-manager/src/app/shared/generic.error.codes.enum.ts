const genericErrorMessages = {
  /* eslint-disable @typescript-eslint/naming-convention */
  EC_0034:
    'This link is no longer valid to be used. Please contact the system admin for assistance with your account or sign in if already registered.',
  EC_0080:
    'Your session has been terminated as a security measure, either due to inactivity or an account update. Please sign in again to continue.',

  /* eslint-enable @typescript-eslint/naming-convention */
};
export type GenericErrorCode = keyof typeof genericErrorMessages;

export function getGenericMessage(key: GenericErrorCode): string {
  return genericErrorMessages[key];
}
