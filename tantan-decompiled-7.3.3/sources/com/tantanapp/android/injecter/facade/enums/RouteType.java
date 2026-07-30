package com.tantanapp.android.injecter.facade.enums;

/* JADX INFO: loaded from: classes11.dex */
public enum RouteType {
    ACTIVITY(0, "android.app.Activity"),
    SERVICE(1, "android.app.Service"),
    PROVIDER(2, "com.tantanapp.android.injecter.facade.template.IProvider"),
    CONTENT_PROVIDER(-1, "android.app.ContentProvider"),
    BOARDCAST(-1, ""),
    METHOD(-1, ""),
    FRAGMENT(-1, "android.app.Fragment"),
    UNKNOWN(-1, "Unknown route type");

    String className;

    /* JADX INFO: renamed from: id */
    int f56683id;

    RouteType(int i, String str) {
        this.f56683id = i;
        this.className = str;
    }

    public static RouteType parse(String str) {
        for (RouteType routeType : values()) {
            if (routeType.getClassName().equals(str)) {
                return routeType;
            }
        }
        return UNKNOWN;
    }

    public String getClassName() {
        return this.className;
    }

    public int getId() {
        return this.f56683id;
    }

    public RouteType setClassName(String str) {
        this.className = str;
        return this;
    }

    public RouteType setId(int i) {
        this.f56683id = i;
        return this;
    }
}
