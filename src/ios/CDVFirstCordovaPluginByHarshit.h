#import <Cordova/CDVFirstCordovaPluginByHarshit.h>

@interface FirstCordovaPluginByHarshit: CDVFirstCordovaPluginByHarshit {

}
// Hooks for my plugin command

- (void) echo: (CDVInvokedUrlCommand *) command;
- (void) getMyBirthDay: (CDVInvokedUrlCommand *) command;

@end
