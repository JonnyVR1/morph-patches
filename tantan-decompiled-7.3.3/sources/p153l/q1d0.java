package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class q1d0 {

    /* JADX INFO: renamed from: c */
    public static final List<pf60<Integer, String>> f155171c = jyb.m147507f0(jyb.m147494Y(1, zrv.f205803e.getString(R$string.f47930Ya)), jyb.m147494Y(2, zrv.f205803e.getString(R$string.f48079f7)), jyb.m147494Y(3, zrv.f205803e.getString(R$string.f47477D6)), jyb.m147494Y(4, zrv.f205803e.getString(R$string.f47404A)), jyb.m147494Y(5, zrv.f205803e.getString(R$string.f47433B6)), jyb.m147494Y(6, zrv.f205803e.getString(R$string.f47744Pd)), jyb.m147494Y(11, zrv.f205803e.getString(R$string.f48478xb)), jyb.m147494Y(8, zrv.f205803e.getString(R$string.f47499E6)), jyb.m147494Y(7, zrv.f205803e.getString(R$string.f48393te)));

    /* JADX INFO: renamed from: d */
    public static final List<pf60<Integer, String>> f155172d = jyb.m147507f0(jyb.m147494Y(12, zrv.f205803e.getString(R$string.f48434vb)), jyb.m147494Y(13, zrv.f205803e.getString(R$string.f48412ub)), jyb.m147494Y(14, zrv.f205803e.getString(R$string.f48456wb)));

    /* JADX INFO: renamed from: e */
    public static final List<pf60<Integer, String>> f155173e = jyb.m147507f0(jyb.m147494Y(13, zrv.f205803e.getString(R$string.f48412ub)), jyb.m147494Y(14, zrv.f205803e.getString(R$string.f48456wb)));

    /* JADX INFO: renamed from: a */
    @Nullable
    public Dialog f155174a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public kcg0 f155175b;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m174855d(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m174856e(pf60 pf60Var) {
        return (String) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: h */
    public void m174859h() {
        Dialog dialog = this.f155174a;
        if (dialog != null) {
            dialog.dismiss();
        }
        psd0.m173633z(this.f155175b);
    }

    /* JADX INFO: renamed from: i */
    public final void m174860i(String str, String str2, String str3, int i, long j, boolean z, final String str4, String str5, int i2) {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.liveId = str;
        bLiveChatReport.roomId = str2;
        bLiveChatReport.seq = j;
        bLiveChatReport.type = i;
        bLiveChatReport.reportedUserId = str3;
        bLiveChatReport.fakeId = str5;
        bLiveChatReport.roomType = i2;
        psd0.m173633z(this.f155175b);
        this.f155175b = (z ? LivingNormalApiProvider.m72595a7(bLiveChatReport) : LivingNormalApiProvider.m72585Z6(bLiveChatReport, str3)).doOnNext(new y20() { // from class: l.m1d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134411a.m174862k(str4, (BLiveEnvelope) obj);
            }
        }).doOnError(new y20() { // from class: l.n1d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139752a.m174866o((Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.o1d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144637a.m174863l((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.p1d0
            @Override // p153l.y20
            public final void call(Object obj) {
                q1d0.m174855d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final String m174861j(nsv<User> nsvVar) {
        pyl pylVarM164642g = nsvVar.m164642g();
        return pylVarM164642g instanceof e3t ? ((e3t) pylVarM164642g).m119320b() : "";
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m174862k(String str, BLiveEnvelope bLiveEnvelope) {
        m174867p(bLiveEnvelope.meta, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m174863l(BLiveEnvelope bLiveEnvelope) {
        Dialog dialog = this.f155174a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m174864m(String str, String str2, nsv nsvVar, List list, long j, boolean z, String str3, int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        m174860i(str, str2, nsvVar.m164643h().f56859id, ((Integer) ((pf60) list.get(i2)).f152156a).intValue(), j, z, str3, m174861j(nsvVar), i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m174865n(DialogInterface dialogInterface) {
        psd0.m173633z(this.f155175b);
    }

    /* JADX INFO: renamed from: o */
    public final void m174866o(Throwable th) {
        o1j0.m165651y(zrv.f205803e.getString(R$string.f47568H9));
        Dialog dialog = this.f155174a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m174867p(@Nullable Meta meta, String str) {
        if (meta == null) {
            m174866o(new NullPointerException("Meta is Null"));
            return;
        }
        int i = meta.code;
        if (i >= 200 && i < 300) {
            o1j0.m165651y(str);
        } else {
            if (i < 400 || i >= 600) {
                return;
            }
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47568H9));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m174868q(Act act, @NonNull final nsv<User> nsvVar, final String str, final String str2, final long j, final boolean z, final String str3, final int i) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (z) {
            arrayList = new ArrayList(f155171c);
        } else {
            arrayList = (!zrv.f205799a.m207638I() || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) ? new ArrayList(f155172d) : new ArrayList(f155173e);
        }
        final ArrayList arrayList2 = arrayList;
        this.f155174a = act.dialog().m21534e0(jyb.m147486Q(arrayList2, new qcj() { // from class: l.j1d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q1d0.m174856e((pf60) obj);
            }
        })).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.k1d0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f123476a.m174864m(str, str2, nsvVar, arrayList2, j, z, str3, i, dialog, view, i2, charSequence);
            }
        }).m21495B(true).m21548q(false).m21525V(new DialogInterface.OnDismissListener() { // from class: l.l1d0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f129667a.m174865n(dialogInterface);
            }
        }).m21567z0();
    }
}
