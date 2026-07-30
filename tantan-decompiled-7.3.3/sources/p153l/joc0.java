package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/joc0;", "", "<init>", "()V", "Ll/bjs;", "presenter", "", "e", "(Ll/bjs;)Z", "Ll/uoe0;", "requestInfo", "Ll/y20;", "action", "", Constants.INAPP_DATA_TAG, "(Ll/bjs;Ll/uoe0;Ll/y20;)V", "", "receiveUserCount", "f", "(Ll/bjs;Ll/uoe0;Ll/y20;I)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class joc0 {

    @NotNull
    public static final joc0 INSTANCE = new joc0();

    /* JADX INFO: renamed from: a */
    public static void m146429a(jl80 jl80Var, View view) {
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m146430b(DialogInterface dialogInterface) {
        eoc0.INSTANCE.m121741d();
    }

    /* JADX INFO: renamed from: c */
    public static void m146431c(y20 y20Var, uoe0 uoe0Var, jl80 jl80Var, View view) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109962f();
        eoc0.INSTANCE.m121740c();
        y20Var.call(uoe0Var);
        jl80Var.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m146432d(@NotNull bjs<?> presenter, @NotNull uoe0 requestInfo, @NotNull y20<uoe0> action) {
        presenter.getClass();
        requestInfo.getClass();
        action.getClass();
        if (!presenter.m213810E2().m168538n0().isVoiceLive() || (!presenter.isShowing() && !vxr.m203876d().m170980I0())) {
            action.call(requestInfo);
            return;
        }
        Object objM138856F3 = presenter.m138856F3(new vme0(700));
        objM138856F3.getClass();
        List<coj> list = (List) objM138856F3;
        if (jyb.m147479J(list)) {
            return;
        }
        requestInfo.m196990q(list);
        if (!((civ) zrv.m221194l(htd0.f111524f)).m109963g() || list.size() < 2) {
            action.call(requestInfo);
        } else {
            eoc0.INSTANCE.m121739b();
            INSTANCE.m146434f(presenter, requestInfo, action, list.size());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m146433e(@NotNull bjs<?> presenter) {
        presenter.getClass();
        if ((!presenter.isShowing() && !vxr.m203876d().m170980I0()) || !NullChecker.m82486a(presenter.m213810E2()) || !NullChecker.m82486a(presenter.m213810E2().m168538n0()) || !presenter.m213810E2().m168538n0().isVoiceLive() || TextUtils.equals(presenter.m104706H4(), "voiceLiveAudience")) {
            return false;
        }
        Object objM138856F3 = presenter.m138856F3(new vme0(700));
        objM138856F3.getClass();
        return !((List) objM138856F3).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public final void m146434f(bjs<?> presenter, final uoe0 requestInfo, final y20<uoe0> action, int receiveUserCount) {
        Act act = presenter.act();
        if (act == null || act.isFinishing()) {
            return;
        }
        View viewInflate = act.inflater().inflate(yec0.f199278v1, (ViewGroup) null);
        viewInflate.getClass();
        Button button = (Button) viewInflate.findViewById(mdc0.f136354z0);
        TextView textView = (TextView) viewInflate.findViewById(mdc0.f136168f0);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(mdc0.f136150d2);
        TextView textView2 = (TextView) viewInflate.findViewById(mdc0.f136230l2);
        TextView textView3 = (TextView) viewInflate.findViewById(mdc0.f136248n2);
        TextView textView4 = (TextView) viewInflate.findViewById(mdc0.f136243m6);
        TextView textView5 = (TextView) viewInflate.findViewById(mdc0.f136252n6);
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(requestInfo.f180056d);
        izs.m142870u("context_livingAct", vDraweeView, bLiveGiftItemM135161m.url, qa00.m175859d(76.0f), qa00.m175859d(76.0f));
        textView2.setText(bLiveGiftItemM135161m.getLocalName());
        textView3.setText(xau.m209911u(u8n.m195065a() ? R$string.f48349re : R$string.f48239me, a9g0.m96569d(bLiveGiftItemM135161m.getPrice())));
        textView4.setText(xau.m209911u(u8n.m195065a() ? R$string.f47624K : R$string.f47602J, Integer.valueOf(receiveUserCount)));
        textView5.setText(xau.m209911u(u8n.m195065a() ? R$string.f47646L : R$string.f47667M, Long.valueOf(((long) (requestInfo.f180058f * receiveUserCount)) * bLiveGiftItemM135161m.getPrice())));
        final jl80 jl80VarM146049r0 = act.newDialog().m146023R(viewInflate).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.goc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                joc0.m146430b(dialogInterface);
            }
        }).m146049r0();
        bnl0.m105509E0(button, new View.OnClickListener() { // from class: l.hoc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                joc0.m146431c(action, requestInfo, jl80VarM146049r0, view);
            }
        });
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.ioc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                joc0.m146429a(jl80VarM146049r0, view);
            }
        });
    }
}
