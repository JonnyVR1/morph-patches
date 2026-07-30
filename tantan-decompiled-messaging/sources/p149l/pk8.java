package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.DeviceIdentifier;
import com.p046p1.mobile.putong.data.DeviceOs;
import com.p046p1.mobile.putong.data.DevicePush;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.JSBridgeVersion;
import com.tantanapp.common.data.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class pk8 extends xh5 {

    /* JADX INFO: renamed from: d */
    public static final zpd0 f149947d = new zpd0("create_device_time", 0L);

    /* JADX INFO: renamed from: e */
    public static final uqd0 f149948e = new uqd0("idfp_sp", "");

    /* JADX INFO: renamed from: f */
    public static String f149949f;

    /* JADX INFO: renamed from: a */
    public uqd0 f149950a;

    /* JADX INFO: renamed from: b */
    public C22392a<Boolean> f149951b;

    /* JADX INFO: renamed from: c */
    public tpd0 f149952c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(qib0.f154730s);
        sb.append("_");
        sb.append(qib0.f154732t);
        sb.append(TextUtils.equals("nolive", "intl") ? "_nolive" : "");
        sb.append("_");
        sb.append(mr4.f135329a);
        f149949f = sb.toString();
    }

    public pk8(xh5 xh5Var) {
        super(xh5Var);
        this.f149950a = new uqd0("reigistered_device_id" + qib0.f154714c0.userId(), null);
        this.f149951b = C22392a.m221513c(Boolean.FALSE);
        this.f149952c = new tpd0("device_info_version", 0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m169972A(Envelope envelope) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m169976E(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static Device m169977F(List<DevicePush> list) {
        Device deviceM169980M = m169980M();
        ArrayList arrayList = new ArrayList();
        deviceM169980M.devicePushNotifications = arrayList;
        arrayList.addAll(list);
        return deviceM169980M;
    }

    /* JADX INFO: renamed from: G */
    public static String m169978G() {
        return f149949f;
    }

    /* JADX INFO: renamed from: H */
    public static String m169979H() {
        return jjb0.m141786d() ? "4.0.0" : JSBridgeVersion.JSBRIDGE_API_VERSION;
    }

    /* JADX INFO: renamed from: M */
    public static Device m169980M() {
        Device device = new Device();
        device.appBuild = m169978G();
        device.bundleId = App.f15369e.getPackageName();
        device.appVersion = qib0.f154730s;
        device.identifier = dyd.m114055a();
        device.identifiers = m169981N();
        device.name = Build.MODEL;
        device.language = Network.language();
        device.locale = Locale.getDefault().toString();
        DeviceOs deviceOs = new DeviceOs();
        device.operatingSystem = deviceOs;
        deviceOs.name = "Android";
        deviceOs.version = Build.VERSION.RELEASE;
        if (qib0.m174779J0()) {
            device.appUIVersion = m169979H();
        }
        device.brand = Build.BRAND;
        if (jjb0.m141783a()) {
            device.oneid = sh50.m184159d();
        }
        return device;
    }

    /* JADX INFO: renamed from: N */
    public static List<DeviceIdentifier> m169981N() {
        ArrayList arrayList = new ArrayList();
        DeviceIdentifier deviceIdentifierNew_ = DeviceIdentifier.new_();
        deviceIdentifierNew_.name = "uuid";
        deviceIdentifierNew_.token = dyd.m114055a();
        arrayList.add(deviceIdentifierNew_);
        if (!TextUtils.isEmpty(dyd.m114058d())) {
            DeviceIdentifier deviceIdentifierNew_2 = DeviceIdentifier.new_();
            deviceIdentifierNew_2.name = Device.IMEI;
            deviceIdentifierNew_2.token = dyd.m114058d();
            arrayList.add(deviceIdentifierNew_2);
        }
        if (!TextUtils.isEmpty(dyd.m114059e())) {
            DeviceIdentifier deviceIdentifierNew_3 = DeviceIdentifier.new_();
            deviceIdentifierNew_3.name = Device.IMEI1;
            deviceIdentifierNew_3.token = dyd.m114059e();
            arrayList.add(deviceIdentifierNew_3);
        }
        if (!TextUtils.isEmpty(dyd.m114060f())) {
            DeviceIdentifier deviceIdentifierNew_4 = DeviceIdentifier.new_();
            deviceIdentifierNew_4.name = Device.IMEI2;
            deviceIdentifierNew_4.token = dyd.m114060f();
            arrayList.add(deviceIdentifierNew_4);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && !TextUtils.isEmpty(dyd.m114061g())) {
            DeviceIdentifier deviceIdentifierNew_5 = DeviceIdentifier.new_();
            deviceIdentifierNew_5.name = Device.MEID;
            deviceIdentifierNew_5.token = dyd.m114061g();
            arrayList.add(deviceIdentifierNew_5);
        }
        if (i >= 26 && !TextUtils.isEmpty(dyd.m114062h())) {
            DeviceIdentifier deviceIdentifierNew_6 = DeviceIdentifier.new_();
            deviceIdentifierNew_6.name = Device.MEID1;
            deviceIdentifierNew_6.token = dyd.m114062h();
            arrayList.add(deviceIdentifierNew_6);
        }
        if (i >= 26 && !TextUtils.isEmpty(dyd.m114063i())) {
            DeviceIdentifier deviceIdentifierNew_7 = DeviceIdentifier.new_();
            deviceIdentifierNew_7.name = Device.MEID2;
            deviceIdentifierNew_7.token = dyd.m114063i();
            arrayList.add(deviceIdentifierNew_7);
        }
        if (!TextUtils.isEmpty(k200.m144241b())) {
            DeviceIdentifier deviceIdentifierNew_8 = DeviceIdentifier.new_();
            deviceIdentifierNew_8.name = Device.OAID;
            deviceIdentifierNew_8.token = k200.m144241b();
            arrayList.add(deviceIdentifierNew_8);
        }
        String strM184159d = sh50.m184159d();
        if (!TextUtils.isEmpty(strM184159d)) {
            DeviceIdentifier deviceIdentifierNew_9 = DeviceIdentifier.new_();
            deviceIdentifierNew_9.name = Device.ONEID;
            deviceIdentifierNew_9.token = strM184159d;
            arrayList.add(deviceIdentifierNew_9);
        }
        DeviceIdentifier deviceIdentifierNew_10 = DeviceIdentifier.new_();
        deviceIdentifierNew_10.name = Device.IDFP;
        uqd0 uqd0Var = f149948e;
        if (TextUtils.isEmpty(uqd0Var.get())) {
            uqd0Var.put(UUID.randomUUID().toString());
        }
        deviceIdentifierNew_10.token = uqd0Var.get();
        arrayList.add(deviceIdentifierNew_10);
        return arrayList;
    }

    /* JADX INFO: renamed from: I */
    public C22392a<Boolean> m169985I() {
        return this.f149951b;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m169986J(roj0 roj0Var) {
        this.f149950a.clear();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Device m169987K(Device device, Envelope envelope) {
        this.f149951b.m132487l(Boolean.valueOf(!vwb.m200296J(device.devicePushNotifications)));
        return ((CommonData) envelope.getModuleData(CommonData.class)).devices.get(0);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m169988L(Device device) {
        this.f149950a.put(device.f38738id);
    }

    /* JADX INFO: renamed from: O */
    public C22306c<roj0> m169989O() {
        if (jjb0.m141783a()) {
            qib0.f154700O.m169990P(false);
        }
        final Device deviceM169980M = m169980M();
        this.f149951b.m132487l(Boolean.FALSE);
        return new ka20(new v9j() { // from class: l.hk8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(xh5.m208768p("/devices?method=delete")).m185893l(utc0.create(Network.JSON, deviceM169980M.toJson())).m185883b();
            }
        }, JsonAdapter.UNIT_ADAPTER).doOnNext(new e30() { // from class: l.ik8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113647a.m169986J((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m169990P(final boolean z) {
        final Device deviceM169977F = m169977F(TantanApp.f17180c.m214273y());
        now(new ka20(new v9j() { // from class: l.jk8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(xh5.m208762j(z ? "/devices/bind" : "/devices/bind?method=delete")).m185893l(utc0.create(Network.JSON, deviceM169977F.toJson())).m185883b();
            }
        }, Envelope.JSON_ADAPTER).compose(mkd0.m154951C())).subscribe(mkd0.m154956H(new e30() { // from class: l.kk8
            @Override // p149l.e30
            public final void call(Object obj) {
                pk8.m169972A((Envelope) obj);
            }
        }, new e30() { // from class: l.lk8
            @Override // p149l.e30
            public final void call(Object obj) {
                pk8.m169976E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<Device> m169991Q(List<DevicePush> list) {
        if (this.f149952c.get().intValue() != 1) {
            this.f149950a.clear();
            this.f149952c.put(1);
        }
        final Device deviceM169980M = m169980M();
        deviceM169980M.devicePushNotifications = new ArrayList();
        Iterator<DevicePush> it = list.iterator();
        while (it.hasNext()) {
            deviceM169980M.devicePushNotifications.add(it.next());
        }
        return new ka20(new v9j() { // from class: l.mk8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(xh5.m208768p("/devices")).m185893l(utc0.create(Network.JSON, deviceM169980M.toJson())).m185883b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.nk8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139382a.m169987K(deviceM169980M, (Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.ok8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144403a.m169988L((Device) obj);
            }
        });
    }
}
