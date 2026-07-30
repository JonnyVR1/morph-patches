package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.DeviceIdentifier;
import com.p051p1.mobile.putong.data.DeviceOs;
import com.p051p1.mobile.putong.data.DevicePush;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.JSBridgeVersion;
import com.tantanapp.common.data.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class tl8 extends xi5 {

    /* JADX INFO: renamed from: d */
    public static final byd0 f174796d = new byd0("create_device_time", 0L);

    /* JADX INFO: renamed from: e */
    public static final wyd0 f174797e = new wyd0("idfp_sp", "");

    /* JADX INFO: renamed from: f */
    public static String f174798f;

    /* JADX INFO: renamed from: a */
    public wyd0 f174799a;

    /* JADX INFO: renamed from: b */
    public C22507a<Boolean> f174800b;

    /* JADX INFO: renamed from: c */
    public vxd0 f174801c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(uqb0.f180413s);
        sb.append("_");
        sb.append(uqb0.f180415t);
        sb.append(TextUtils.equals("nolive", "intl") ? "_nolive" : "");
        sb.append("_");
        sb.append(ls4.f133389a);
        f174798f = sb.toString();
    }

    public tl8(xi5 xi5Var) {
        super(xi5Var);
        this.f174799a = new wyd0("reigistered_device_id" + uqb0.f180397c0.userId(), null);
        this.f174800b = C22507a.m222759c(Boolean.FALSE);
        this.f174801c = new vxd0("device_info_version", 0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m191608A(Envelope envelope) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m191612E(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static Device m191613F(List<DevicePush> list) {
        Device deviceM191616M = m191616M();
        ArrayList arrayList = new ArrayList();
        deviceM191616M.devicePushNotifications = arrayList;
        arrayList.addAll(list);
        return deviceM191616M;
    }

    /* JADX INFO: renamed from: G */
    public static String m191614G() {
        return f174798f;
    }

    /* JADX INFO: renamed from: H */
    public static String m191615H() {
        return nrb0.m164468d() ? "4.0.0" : JSBridgeVersion.JSBRIDGE_API_VERSION;
    }

    /* JADX INFO: renamed from: M */
    public static Device m191616M() {
        Device device = new Device();
        device.appBuild = m191614G();
        device.bundleId = App.f16088e.getPackageName();
        device.appVersion = uqb0.f180413s;
        device.identifier = qzd.m178768a();
        device.identifiers = m191617N();
        device.name = Build.MODEL;
        device.language = Network.language();
        device.locale = Locale.getDefault().toString();
        DeviceOs deviceOs = new DeviceOs();
        device.operatingSystem = deviceOs;
        deviceOs.name = "Android";
        deviceOs.version = Build.VERSION.RELEASE;
        if (uqb0.m197233J0()) {
            device.appUIVersion = m191615H();
        }
        device.brand = Build.BRAND;
        if (nrb0.m164465a()) {
            device.oneid = yp50.m217001d();
        }
        return device;
    }

    /* JADX INFO: renamed from: N */
    public static List<DeviceIdentifier> m191617N() {
        ArrayList arrayList = new ArrayList();
        DeviceIdentifier deviceIdentifierNew_ = DeviceIdentifier.new_();
        deviceIdentifierNew_.name = "uuid";
        deviceIdentifierNew_.token = qzd.m178768a();
        arrayList.add(deviceIdentifierNew_);
        if (!TextUtils.isEmpty(qzd.m178771d())) {
            DeviceIdentifier deviceIdentifierNew_2 = DeviceIdentifier.new_();
            deviceIdentifierNew_2.name = Device.IMEI;
            deviceIdentifierNew_2.token = qzd.m178771d();
            arrayList.add(deviceIdentifierNew_2);
        }
        if (!TextUtils.isEmpty(qzd.m178772e())) {
            DeviceIdentifier deviceIdentifierNew_3 = DeviceIdentifier.new_();
            deviceIdentifierNew_3.name = Device.IMEI1;
            deviceIdentifierNew_3.token = qzd.m178772e();
            arrayList.add(deviceIdentifierNew_3);
        }
        if (!TextUtils.isEmpty(qzd.m178773f())) {
            DeviceIdentifier deviceIdentifierNew_4 = DeviceIdentifier.new_();
            deviceIdentifierNew_4.name = Device.IMEI2;
            deviceIdentifierNew_4.token = qzd.m178773f();
            arrayList.add(deviceIdentifierNew_4);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && !TextUtils.isEmpty(qzd.m178774g())) {
            DeviceIdentifier deviceIdentifierNew_5 = DeviceIdentifier.new_();
            deviceIdentifierNew_5.name = Device.MEID;
            deviceIdentifierNew_5.token = qzd.m178774g();
            arrayList.add(deviceIdentifierNew_5);
        }
        if (i >= 26 && !TextUtils.isEmpty(qzd.m178775h())) {
            DeviceIdentifier deviceIdentifierNew_6 = DeviceIdentifier.new_();
            deviceIdentifierNew_6.name = Device.MEID1;
            deviceIdentifierNew_6.token = qzd.m178775h();
            arrayList.add(deviceIdentifierNew_6);
        }
        if (i >= 26 && !TextUtils.isEmpty(qzd.m178776i())) {
            DeviceIdentifier deviceIdentifierNew_7 = DeviceIdentifier.new_();
            deviceIdentifierNew_7.name = Device.MEID2;
            deviceIdentifierNew_7.token = qzd.m178776i();
            arrayList.add(deviceIdentifierNew_7);
        }
        if (!TextUtils.isEmpty(hb00.m134333b())) {
            DeviceIdentifier deviceIdentifierNew_8 = DeviceIdentifier.new_();
            deviceIdentifierNew_8.name = Device.OAID;
            deviceIdentifierNew_8.token = hb00.m134333b();
            arrayList.add(deviceIdentifierNew_8);
        }
        String strM217001d = yp50.m217001d();
        if (!TextUtils.isEmpty(strM217001d)) {
            DeviceIdentifier deviceIdentifierNew_9 = DeviceIdentifier.new_();
            deviceIdentifierNew_9.name = Device.ONEID;
            deviceIdentifierNew_9.token = strM217001d;
            arrayList.add(deviceIdentifierNew_9);
        }
        DeviceIdentifier deviceIdentifierNew_10 = DeviceIdentifier.new_();
        deviceIdentifierNew_10.name = Device.IDFP;
        wyd0 wyd0Var = f174797e;
        if (TextUtils.isEmpty(wyd0Var.get())) {
            wyd0Var.put(UUID.randomUUID().toString());
        }
        deviceIdentifierNew_10.token = wyd0Var.get();
        arrayList.add(deviceIdentifierNew_10);
        return arrayList;
    }

    /* JADX INFO: renamed from: I */
    public C22507a<Boolean> m191621I() {
        return this.f174800b;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m191622J(uxj0 uxj0Var) {
        this.f174799a.clear();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Device m191623K(Device device, Envelope envelope) {
        this.f174800b.m137019l(Boolean.valueOf(!jyb.m147479J(device.devicePushNotifications)));
        return ((CommonData) envelope.getModuleData(CommonData.class)).devices.get(0);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m191624L(Device device) {
        this.f174799a.put(device.f39586id);
    }

    /* JADX INFO: renamed from: O */
    public C22421c<uxj0> m191625O() {
        if (nrb0.m164465a()) {
            uqb0.f180383O.m191626P(false);
        }
        final Device deviceM191616M = m191616M();
        this.f174800b.m137019l(Boolean.FALSE);
        return new si20(new pcj() { // from class: l.ll8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(xi5.m211114p("/devices?method=delete")).m209038l(z1d0.create(Network.JSON, deviceM191616M.toJson())).m209028b();
            }
        }, JsonAdapter.UNIT_ADAPTER).doOnNext(new y20() { // from class: l.ml8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137375a.m191622J((uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m191626P(final boolean z) {
        final Device deviceM191613F = m191613F(TantanApp.f17899c.m111151y());
        now(new si20(new pcj() { // from class: l.nl8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(xi5.m211108j(z ? "/devices/bind" : "/devices/bind?method=delete")).m209038l(z1d0.create(Network.JSON, deviceM191613F.toJson())).m209028b();
            }
        }, Envelope.JSON_ADAPTER).compose(psd0.m173592C())).subscribe(psd0.m173597H(new y20() { // from class: l.ol8
            @Override // p153l.y20
            public final void call(Object obj) {
                tl8.m191608A((Envelope) obj);
            }
        }, new y20() { // from class: l.pl8
            @Override // p153l.y20
            public final void call(Object obj) {
                tl8.m191612E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<Device> m191627Q(List<DevicePush> list) {
        if (this.f174801c.get().intValue() != 1) {
            this.f174799a.clear();
            this.f174801c.put(1);
        }
        final Device deviceM191616M = m191616M();
        deviceM191616M.devicePushNotifications = new ArrayList();
        Iterator<DevicePush> it = list.iterator();
        while (it.hasNext()) {
            deviceM191616M.devicePushNotifications.add(it.next());
        }
        return new si20(new pcj() { // from class: l.ql8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(xi5.m211114p("/devices")).m209038l(z1d0.create(Network.JSON, deviceM191616M.toJson())).m209028b();
            }
        }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.rl8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163707a.m191623K(deviceM191616M, (Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.sl8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169355a.m191624L((Device) obj);
            }
        });
    }
}
