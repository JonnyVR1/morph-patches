package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/cgc0;", "", "<init>", "()V", "Ll/ahs;", "presenter", "", "e", "(Ll/ahs;)Z", "Ll/pge0;", "requestInfo", "Ll/e30;", "action", "", Constants.INAPP_DATA_TAG, "(Ll/ahs;Ll/pge0;Ll/e30;)V", "", "receiveUserCount", "f", "(Ll/ahs;Ll/pge0;Ll/e30;I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class cgc0 {

    @NotNull
    public static final cgc0 INSTANCE = new cgc0();

    /* JADX INFO: renamed from: a */
    public static void m106698a(dd80 dd80Var, View view) {
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m106699b(DialogInterface dialogInterface) {
        xfc0.INSTANCE.m208603d();
    }

    /* JADX INFO: renamed from: c */
    public static void m106700c(e30 e30Var, pge0 pge0Var, dd80 dd80Var, View view) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101726f();
        xfc0.INSTANCE.m208602c();
        e30Var.call(pge0Var);
        dd80Var.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m106701d(@NotNull ahs<?> presenter, @NotNull pge0 requestInfo, @NotNull e30<pge0> action) {
        presenter.getClass();
        requestInfo.getClass();
        action.getClass();
        if (!presenter.m206027E2().m132152n0().isVoiceLive() || (!presenter.isShowing() && !uvr.m196087d().m162673I0())) {
            action.call(requestInfo);
            return;
        }
        Object objM129297F3 = presenter.m129297F3(new qee0(700));
        objM129297F3.getClass();
        List<mlj> list = (List) objM129297F3;
        if (vwb.m200296J(list)) {
            return;
        }
        requestInfo.m168691q(list);
        if (!((bgv) ypv.m215673l(fld0.f98151f)).m101727g() || list.size() < 2) {
            action.call(requestInfo);
        } else {
            xfc0.INSTANCE.m208601b();
            INSTANCE.m106703f(presenter, requestInfo, action, list.size());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m106702e(@NotNull ahs<?> presenter) {
        presenter.getClass();
        if ((!presenter.isShowing() && !uvr.m196087d().m162673I0()) || !NullChecker.m81303a(presenter.m206027E2()) || !NullChecker.m81303a(presenter.m206027E2().m132152n0()) || !presenter.m206027E2().m132152n0().isVoiceLive() || TextUtils.equals(presenter.m96619H4(), "voiceLiveAudience")) {
            return false;
        }
        Object objM129297F3 = presenter.m129297F3(new qee0(700));
        objM129297F3.getClass();
        return !((List) objM129297F3).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public final void m106703f(ahs<?> presenter, final pge0 requestInfo, final e30<pge0> action, int receiveUserCount) {
        Act act = presenter.act();
        if (act == null || act.isFinishing()) {
            return;
        }
        View viewInflate = act.inflater().inflate(t6c0.f168546v1, (ViewGroup) null);
        viewInflate.getClass();
        Button button = (Button) viewInflate.findViewById(g5c0.f101109z0);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f100923f0);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(g5c0.f100905d2);
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f100985l2);
        TextView textView3 = (TextView) viewInflate.findViewById(g5c0.f101003n2);
        TextView textView4 = (TextView) viewInflate.findViewById(g5c0.f100998m6);
        TextView textView5 = (TextView) viewInflate.findViewById(g5c0.f101007n6);
        BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(requestInfo.f148655d);
        hxs.m133408u("context_livingAct", vDraweeView, bLiveGiftItemM126027m.url, t100.m186890d(76.0f), t100.m186890d(76.0f));
        textView2.setText(bLiveGiftItemM126027m.getLocalName());
        textView3.setText(w8u.m202218u(u6n.m192015a() ? R$string.f47501re : R$string.f47391me, t0g0.m186863d(bLiveGiftItemM126027m.getPrice())));
        textView4.setText(w8u.m202218u(u6n.m192015a() ? R$string.f46776K : R$string.f46754J, Integer.valueOf(receiveUserCount)));
        textView5.setText(w8u.m202218u(u6n.m192015a() ? R$string.f46798L : R$string.f46819M, Long.valueOf(((long) (requestInfo.f148657f * receiveUserCount)) * bLiveGiftItemM126027m.getPrice())));
        final dd80 dd80VarM110989r0 = act.newDialog().m110963R(viewInflate).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zfc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cgc0.m106699b(dialogInterface);
            }
        }).m110989r0();
        xdl0.m208329E0(button, new View.OnClickListener() { // from class: l.agc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgc0.m106700c(action, requestInfo, dd80VarM110989r0, view);
            }
        });
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.bgc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgc0.m106698a(dd80VarM110989r0, view);
            }
        });
    }
}
