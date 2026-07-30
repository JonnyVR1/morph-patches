package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import l.bgv;
import l.dd80;
import l.e30;
import l.fld0;
import l.ggv;
import l.hxs;
import l.t0g0;
import l.t100;
import l.u6n;
import l.uvr;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll/cgc0;", "", "<init>", "()V", "Ll/ahs;", "presenter", "", "e", "(Ll/ahs;)Z", "Ll/pge0;", "requestInfo", "Ll/e30;", "action", "", "d", "(Ll/ahs;Ll/pge0;Ll/e30;)V", "", "receiveUserCount", "f", "(Ll/ahs;Ll/pge0;Ll/e30;I)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cgc0 {

    @NotNull
    public static final cgc0 INSTANCE = new cgc0();

    /* JADX INFO: renamed from: a */
    public static void m11024a(dd80 dd80Var, View view) {
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m11025b(DialogInterface dialogInterface) {
        xfc0.INSTANCE.m25908d();
    }

    /* JADX INFO: renamed from: c */
    public static void m11026c(e30 e30Var, pge0 pge0Var, dd80 dd80Var, View view) {
        ((bgv) ypv.l(fld0.f)).f();
        xfc0.INSTANCE.m25907c();
        e30Var.call(pge0Var);
        dd80Var.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m11027d(@NotNull ahs<?> presenter, @NotNull pge0 requestInfo, @NotNull e30<pge0> action) {
        presenter.getClass();
        requestInfo.getClass();
        action.getClass();
        if (!presenter.m25547E2().m14588n0().isVoiceLive() || (!presenter.isShowing() && !uvr.d().I0())) {
            action.call(requestInfo);
            return;
        }
        Object objM14184F3 = presenter.m14184F3(new qee0(700));
        objM14184F3.getClass();
        List<mlj> list = (List) objM14184F3;
        if (vwb.J(list)) {
            return;
        }
        requestInfo.m20256q(list);
        if (!((bgv) ypv.l(fld0.f)).g() || list.size() < 2) {
            action.call(requestInfo);
        } else {
            xfc0.INSTANCE.m25906b();
            INSTANCE.m11029f(presenter, requestInfo, action, list.size());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m11028e(@NotNull ahs<?> presenter) {
        presenter.getClass();
        if ((!presenter.isShowing() && !uvr.d().I0()) || !NullChecker.a(presenter.m25547E2()) || !NullChecker.a(presenter.m25547E2().m14588n0()) || !presenter.m25547E2().m14588n0().isVoiceLive() || TextUtils.equals(presenter.m9715H4(), "voiceLiveAudience")) {
            return false;
        }
        Object objM14184F3 = presenter.m14184F3(new qee0(700));
        objM14184F3.getClass();
        return !((List) objM14184F3).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public final void m11029f(ahs<?> presenter, final pge0 requestInfo, final e30<pge0> action, int receiveUserCount) {
        Act act = presenter.act();
        if (act == null || act.isFinishing()) {
            return;
        }
        View viewInflate = act.inflater().inflate(t6c0.f20042v1, (ViewGroup) null);
        viewInflate.getClass();
        Button button = (Button) viewInflate.findViewById(g5c0.f11259z0);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f11073f0);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(g5c0.f11055d2);
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f11135l2);
        TextView textView3 = (TextView) viewInflate.findViewById(g5c0.f11153n2);
        TextView textView4 = (TextView) viewInflate.findViewById(g5c0.f11148m6);
        TextView textView5 = (TextView) viewInflate.findViewById(g5c0.f11157n6);
        BLiveGiftItem bLiveGiftItemM = ((ggv) ypv.l(fld0.c)).m(requestInfo.f17279d);
        hxs.u("context_livingAct", vDraweeViewFindViewById, bLiveGiftItemM.url, t100.d(76.0f), t100.d(76.0f));
        textView2.setText(bLiveGiftItemM.getLocalName());
        textView3.setText(w8u.u(u6n.a() ? R$string.f3543re : R$string.f3433me, t0g0.d(bLiveGiftItemM.getPrice())));
        textView4.setText(w8u.u(u6n.a() ? R$string.f2818K : R$string.f2796J, Integer.valueOf(receiveUserCount)));
        textView5.setText(w8u.u(u6n.a() ? R$string.f2840L : R$string.f2861M, Long.valueOf(((long) (requestInfo.f17281f * receiveUserCount)) * bLiveGiftItemM.getPrice())));
        final dd80 dd80VarR0 = act.newDialog().R(viewInflate).n0(new DialogInterface.OnDismissListener() { // from class: l.zfc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cgc0.m11025b(dialogInterface);
            }
        }).r0();
        xdl0.E0(button, new View.OnClickListener() { // from class: l.agc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgc0.m11026c(action, requestInfo, dd80VarR0, view);
            }
        });
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.bgc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgc0.m11024a(dd80VarR0, view);
            }
        });
    }
}
