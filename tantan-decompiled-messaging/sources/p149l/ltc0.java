package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ltc0 {

    /* JADX INFO: renamed from: c */
    public static final List<j760<Integer, String>> f129957c = vwb.m200324f0(vwb.m200311Y(1, ypv.f199497e.getString(R$string.f47082Ya)), vwb.m200311Y(2, ypv.f199497e.getString(R$string.f47231f7)), vwb.m200311Y(3, ypv.f199497e.getString(R$string.f46629D6)), vwb.m200311Y(4, ypv.f199497e.getString(R$string.f46556A)), vwb.m200311Y(5, ypv.f199497e.getString(R$string.f46585B6)), vwb.m200311Y(6, ypv.f199497e.getString(R$string.f46896Pd)), vwb.m200311Y(11, ypv.f199497e.getString(R$string.f47630xb)), vwb.m200311Y(8, ypv.f199497e.getString(R$string.f46651E6)), vwb.m200311Y(7, ypv.f199497e.getString(R$string.f47545te)));

    /* JADX INFO: renamed from: d */
    public static final List<j760<Integer, String>> f129958d = vwb.m200324f0(vwb.m200311Y(12, ypv.f199497e.getString(R$string.f47586vb)), vwb.m200311Y(13, ypv.f199497e.getString(R$string.f47564ub)), vwb.m200311Y(14, ypv.f199497e.getString(R$string.f47608wb)));

    /* JADX INFO: renamed from: e */
    public static final List<j760<Integer, String>> f129959e = vwb.m200324f0(vwb.m200311Y(13, ypv.f199497e.getString(R$string.f47564ub)), vwb.m200311Y(14, ypv.f199497e.getString(R$string.f47608wb)));

    /* JADX INFO: renamed from: a */
    @Nullable
    public Dialog f129960a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public c4g0 f129961b;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m151675d(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m151676e(j760 j760Var) {
        return (String) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: h */
    public void m151679h() {
        Dialog dialog = this.f129960a;
        if (dialog != null) {
            dialog.dismiss();
        }
        mkd0.m154992z(this.f129961b);
    }

    /* JADX INFO: renamed from: i */
    public final void m151680i(String str, String str2, String str3, int i, long j, boolean z, final String str4, String str5, int i2) {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.liveId = str;
        bLiveChatReport.roomId = str2;
        bLiveChatReport.seq = j;
        bLiveChatReport.type = i;
        bLiveChatReport.reportedUserId = str3;
        bLiveChatReport.fakeId = str5;
        bLiveChatReport.roomType = i2;
        mkd0.m154992z(this.f129961b);
        this.f129961b = (z ? LivingNormalApiProvider.m71412a7(bLiveChatReport) : LivingNormalApiProvider.m71402Z6(bLiveChatReport, str3)).doOnNext(new e30() { // from class: l.htc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109384a.m151682k(str4, (BLiveEnvelope) obj);
            }
        }).doOnError(new e30() { // from class: l.itc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114872a.m151686o((Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.jtc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119591a.m151683l((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ktc0
            @Override // p149l.e30
            public final void call(Object obj) {
                ltc0.m151675d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final String m151681j(mqv<User> mqvVar) {
        xvl xvlVarM156004g = mqvVar.m156004g();
        return xvlVarM156004g instanceof d1t ? ((d1t) xvlVarM156004g).m109679b() : "";
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m151682k(String str, BLiveEnvelope bLiveEnvelope) {
        m151687p(bLiveEnvelope.meta, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m151683l(BLiveEnvelope bLiveEnvelope) {
        Dialog dialog = this.f129960a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m151684m(String str, String str2, mqv mqvVar, List list, long j, boolean z, String str3, int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        m151680i(str, str2, mqvVar.m156005h().f56011id, ((Integer) ((j760) list.get(i2)).f116564a).intValue(), j, z, str3, m151681j(mqvVar), i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m151685n(DialogInterface dialogInterface) {
        mkd0.m154992z(this.f129961b);
    }

    /* JADX INFO: renamed from: o */
    public final void m151686o(Throwable th) {
        lsi0.m151595y(ypv.f199497e.getString(R$string.f46720H9));
        Dialog dialog = this.f129960a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m151687p(@Nullable Meta meta, String str) {
        if (meta == null) {
            m151686o(new NullPointerException("Meta is Null"));
            return;
        }
        int i = meta.code;
        if (i >= 200 && i < 300) {
            lsi0.m151595y(str);
        } else {
            if (i < 400 || i >= 600) {
                return;
            }
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46720H9));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m151688q(Act act, @NonNull final mqv<User> mqvVar, final String str, final String str2, final long j, final boolean z, final String str3, final int i) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (z) {
            arrayList = new ArrayList(f129957c);
        } else {
            arrayList = (!ypv.f199493a.m199316I() || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) ? new ArrayList(f129958d) : new ArrayList(f129959e);
        }
        final ArrayList arrayList2 = arrayList;
        this.f129960a = act.dialog().m20535e0(vwb.m200303Q(arrayList2, new w9j() { // from class: l.etc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ltc0.m151676e((j760) obj);
            }
        })).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ftc0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f99167a.m151684m(str, str2, mqvVar, arrayList2, j, z, str3, i, dialog, view, i2, charSequence);
            }
        }).m20496B(true).m20549q(false).m20526V(new DialogInterface.OnDismissListener() { // from class: l.gtc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f104271a.m151685n(dialogInterface);
            }
        }).m20568z0();
    }
}
