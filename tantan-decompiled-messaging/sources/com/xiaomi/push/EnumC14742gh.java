package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.gh */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14742gh {
    DeviceInfo(1),
    AppInstallList(2),
    AppActiveList(3),
    Bluetooth(4),
    Location(5),
    Account(6),
    WIFI(7),
    Cellular(8),
    TopApp(9),
    BroadcastAction(10),
    BroadcastActionAdded(11),
    BroadcastActionRemoved(12),
    BroadcastActionReplaced(13),
    BroadcastActionDataCleared(14),
    BroadcastActionRestarted(15),
    BroadcastActionChanged(16),
    AppPermission(17),
    WifiDevicesMac(18),
    ActivityActiveTimeStamp(19),
    DeviceBaseInfo(20),
    DeviceInfoV2(21),
    Battery(22),
    Storage(23),
    AppIsInstalled(24);


    /* JADX INFO: renamed from: a */
    private final int f61862a;

    EnumC14742gh(int i) {
        this.f61862a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14742gh m85602a(int i) {
        switch (i) {
            case 1:
                return DeviceInfo;
            case 2:
                return AppInstallList;
            case 3:
                return AppActiveList;
            case 4:
                return Bluetooth;
            case 5:
                return Location;
            case 6:
                return Account;
            case 7:
                return WIFI;
            case 8:
                return Cellular;
            case 9:
                return TopApp;
            case 10:
                return BroadcastAction;
            case 11:
                return BroadcastActionAdded;
            case 12:
                return BroadcastActionRemoved;
            case 13:
                return BroadcastActionReplaced;
            case 14:
                return BroadcastActionDataCleared;
            case 15:
                return BroadcastActionRestarted;
            case 16:
                return BroadcastActionChanged;
            case 17:
                return AppPermission;
            case 18:
                return WifiDevicesMac;
            case 19:
                return ActivityActiveTimeStamp;
            case 20:
                return DeviceBaseInfo;
            case 21:
                return DeviceInfoV2;
            case 22:
                return Battery;
            case 23:
                return Storage;
            case 24:
                return AppIsInstalled;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m85603a() {
        return this.f61862a;
    }
}
