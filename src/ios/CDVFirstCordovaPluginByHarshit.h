#import <Cordova/CDVFirstCordovaPluginByHarshit.h>

@interface FirstCordovaPluginByHarshit: CDVFirstCordovaPluginByHarshit {

}
// Hooks for my plugin command

- (void) sayMyName: (CDVInvokedUrlCommand *) command;
- (void) sayTheDate: (CDVInvokedUrlCommand *) command;

@end
