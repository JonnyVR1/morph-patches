package p006l;

import android.os.Build;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.DeviceIdentifier;
import com.p1.mobile.putong.data.DeviceOs;
import com.p1.mobile.putong.data.DevicePush;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import l.dyd;
import l.e30;
import l.mkd0;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pk8 extends xh5 {

    /* JADX INFO: renamed from: d */
    public static final zpd0 f19168d = new zpd0("create_device_time", 0L);

    /* JADX INFO: renamed from: e */
    public static final uqd0 f19169e = new uqd0("idfp_sp", "");

    /* JADX INFO: renamed from: f */
    public static String f19170f;

    /* JADX INFO: renamed from: a */
    public uqd0 f19171a;

    /* JADX INFO: renamed from: b */
    public a<Boolean> f19172b;

    /* JADX INFO: renamed from: c */
    public tpd0 f19173c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(qib0.f19821s);
        sb.append("_");
        sb.append(qib0.f19823t);
        sb.append(TextUtils.equals("nolive", "intl") ? "_nolive" : "");
        sb.append("_");
        sb.append(mr4.f17192a);
        f19170f = sb.toString();
    }

    public pk8(xh5 xh5Var) {
        super(xh5Var);
        this.f19171a = new uqd0("reigistered_device_id" + qib0.f19805c0.userId(), (String) null);
        this.f19172b = a.c(Boolean.FALSE);
        this.f19173c = new tpd0("device_info_version", 0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m21554A(Envelope envelope) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m21558E(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public static Device m21559F(List<DevicePush> list) {
        Device deviceM21562M = m21562M();
        ArrayList arrayList = new ArrayList();
        deviceM21562M.devicePushNotifications = arrayList;
        arrayList.addAll(list);
        return deviceM21562M;
    }

    /* JADX INFO: renamed from: G */
    public static String m21560G() {
        return f19170f;
    }

    /* JADX INFO: renamed from: H */
    public static String m21561H() {
        return jjb0.m17489d() ? "4.0.0" : "1.0.0";
    }

    /* JADX INFO: renamed from: M */
    public static Device m21562M() {
        Device device = new Device();
        device.appBuild = m21560G();
        device.bundleId = App.e.getPackageName();
        device.appVersion = qib0.f19821s;
        device.identifier = dyd.a();
        device.identifiers = m21563N();
        device.name = Build.MODEL;
        device.language = Network.language();
        device.locale = Locale.getDefault().toString();
        DeviceOs deviceOs = new DeviceOs();
        device.operatingSystem = deviceOs;
        deviceOs.name = "Android";
        deviceOs.version = Build.VERSION.RELEASE;
        if (qib0.m22123J0()) {
            device.appUIVersion = m21561H();
        }
        device.brand = Build.BRAND;
        if (jjb0.m17486a()) {
            device.oneid = sh50.m23745d();
        }
        return device;
    }

    /* JADX INFO: renamed from: N */
    public static List<DeviceIdentifier> m21563N() {
        ArrayList arrayList = new ArrayList();
        DeviceIdentifier deviceIdentifierNew_ = DeviceIdentifier.new_();
        deviceIdentifierNew_.name = "uuid";
        deviceIdentifierNew_.token = dyd.a();
        arrayList.add(deviceIdentifierNew_);
        if (!TextUtils.isEmpty(dyd.d())) {
            DeviceIdentifier deviceIdentifierNew_2 = DeviceIdentifier.new_();
            deviceIdentifierNew_2.name = "imei";
            deviceIdentifierNew_2.token = dyd.d();
            arrayList.add(deviceIdentifierNew_2);
        }
        if (!TextUtils.isEmpty(dyd.e())) {
            DeviceIdentifier deviceIdentifierNew_3 = DeviceIdentifier.new_();
            deviceIdentifierNew_3.name = "ime1";
            deviceIdentifierNew_3.token = dyd.e();
            arrayList.add(deviceIdentifierNew_3);
        }
        if (!TextUtils.isEmpty(dyd.f())) {
            DeviceIdentifier deviceIdentifierNew_4 = DeviceIdentifier.new_();
            deviceIdentifierNew_4.name = "ime2";
            deviceIdentifierNew_4.token = dyd.f();
            arrayList.add(deviceIdentifierNew_4);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && !TextUtils.isEmpty(dyd.g())) {
            DeviceIdentifier deviceIdentifierNew_5 = DeviceIdentifier.new_();
            deviceIdentifierNew_5.name = "meid";
            deviceIdentifierNew_5.token = dyd.g();
            arrayList.add(deviceIdentifierNew_5);
        }
        if (i >= 26 && !TextUtils.isEmpty(dyd.h())) {
            DeviceIdentifier deviceIdentifierNew_6 = DeviceIdentifier.new_();
            deviceIdentifierNew_6.name = "mei1";
            deviceIdentifierNew_6.token = dyd.h();
            arrayList.add(deviceIdentifierNew_6);
        }
        if (i >= 26 && !TextUtils.isEmpty(dyd.i())) {
            DeviceIdentifier deviceIdentifierNew_7 = DeviceIdentifier.new_();
            deviceIdentifierNew_7.name = "mei2";
            deviceIdentifierNew_7.token = dyd.i();
            arrayList.add(deviceIdentifierNew_7);
        }
        if (!TextUtils.isEmpty(k200.m17914b())) {
            DeviceIdentifier deviceIdentifierNew_8 = DeviceIdentifier.new_();
            deviceIdentifierNew_8.name = "oaid";
            deviceIdentifierNew_8.token = k200.m17914b();
            arrayList.add(deviceIdentifierNew_8);
        }
        String strM23745d = sh50.m23745d();
        if (!TextUtils.isEmpty(strM23745d)) {
            DeviceIdentifier deviceIdentifierNew_9 = DeviceIdentifier.new_();
            deviceIdentifierNew_9.name = "onei";
            deviceIdentifierNew_9.token = strM23745d;
            arrayList.add(deviceIdentifierNew_9);
        }
        DeviceIdentifier deviceIdentifierNew_10 = DeviceIdentifier.new_();
        deviceIdentifierNew_10.name = "idfp";
        uqd0 uqd0Var = f19169e;
        if (TextUtils.isEmpty((CharSequence) uqd0Var.get())) {
            uqd0Var.put(UUID.randomUUID().toString());
        }
        deviceIdentifierNew_10.token = (String) uqd0Var.get();
        arrayList.add(deviceIdentifierNew_10);
        return arrayList;
    }

    /* JADX INFO: renamed from: I */
    public a<Boolean> m21567I() {
        return this.f19172b;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m21568J(roj0 roj0Var) {
        this.f19171a.clear();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Device m21569K(Device device, Envelope envelope) {
        this.f19172b.onNext(Boolean.valueOf(!vwb.J(device.devicePushNotifications)));
        return (Device) envelope.getModuleData(CommonData.class).devices.get(0);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m21570L(Device device) {
        this.f19171a.put(device.id);
    }

    /* JADX INFO: renamed from: O */
    public c<roj0> m21571O() {
        if (jjb0.m17486a()) {
            qib0.f19791O.m21572P(false);
        }
        final Device deviceM21562M = m21562M();
        this.f19172b.onNext(Boolean.FALSE);
        return new ka20(new v9j() { // from class: l.hk8
            public final Object call() {
                return xh5.network.auth().q(xh5.m27257p("/devices?method=delete")).l(utc0.create(Network.JSON, deviceM21562M.toJson())).b();
            }
        }, JsonAdapter.UNIT_ADAPTER).doOnNext(new e30() { // from class: l.ik8
            public final void call(Object obj) {
                this.f14532a.m21568J((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m21572P(final boolean z) {
        final Device deviceM21559F = m21559F(TantanApp.f1169c.m28220y());
        now(new ka20(new v9j() { // from class: l.jk8
            public final Object call() {
                return xh5.network.auth().q(xh5.m27251j(z ? "/devices/bind" : "/devices/bind?method=delete")).l(utc0.create(Network.JSON, deviceM21559F.toJson())).b();
            }
        }, Envelope.JSON_ADAPTER).compose(mkd0.C())).subscribe(mkd0.H(new e30() { // from class: l.kk8
            public final void call(Object obj) {
                pk8.m21554A((Envelope) obj);
            }
        }, new e30() { // from class: l.lk8
            public final void call(Object obj) {
                pk8.m21558E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public c<Device> m21573Q(List<DevicePush> list) {
        if (((Integer) this.f19173c.get()).intValue() != 1) {
            this.f19171a.clear();
            this.f19173c.put(1);
        }
        final Device deviceM21562M = m21562M();
        deviceM21562M.devicePushNotifications = new ArrayList();
        Iterator<DevicePush> it = list.iterator();
        while (it.hasNext()) {
            deviceM21562M.devicePushNotifications.add(it.next());
        }
        return new ka20(new v9j() { // from class: l.mk8
            public final Object call() {
                return xh5.network.auth().q(xh5.m27257p("/devices")).l(utc0.create(Network.JSON, deviceM21562M.toJson())).b();
            }
        }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.nk8
            public final Object call(Object obj) {
                return this.f17719a.m21569K(deviceM21562M, (Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.ok8
            public final void call(Object obj) {
                this.f18264a.m21570L((Device) obj);
            }
        });
    }
}
