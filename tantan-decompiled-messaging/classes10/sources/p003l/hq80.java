package p003l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.NavigationCardIntent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.d3c0;
import l.e51;
import l.i0e;
import l.l5j0;
import l.m6c0;
import l.qib0;
import l.xdl0;
import l.y7c0;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Ll/hq80;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "H", "()V", "C", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "dismiss", "Landroid/view/View;", "view", "A", "(Landroid/view/View;)V", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "D", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "i", "F", "set_subtitle", "_subtitle", "j", "G", "set_title", "_title", "Lv/VDraweeView;", "k", "Lv/VDraweeView;", "E", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/cwf0;", "l", "Ll/cwf0;", "pageHelper", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class hq80 extends l5j0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public cwf0 pageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq80(@NotNull Act act, @Nullable String str) {
        super(act);
        act.getClass();
        this.act = act;
        this.from = str;
        cwf0 cwf0VarC = i0e.c("p_personalized_guide_pop", hq80.class.getName());
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    private final void m7050C() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(d3c0.g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        e51.G(new Runnable() { // from class: l.gq80
            @Override // java.lang.Runnable
            public final void run() {
                hq80.m7054z(this.f4709a);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    private final void m7051H() {
        qib0.G.L0(m7057E(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklUV0dKQVQ3VUVOS09RWDNBVlhDN1NMQjNMSUNJVzE0IiwidyI6NjYwLCJoIjo2NjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NDE2NjgyMzc0OTE5OTg4NTA5fQ.png");
        m7059G().setText("全新 · 私人定制权益包");
        m7058F().setText("根据定制需求实时推送，开启专属社交体验！");
        m7056D().setText("去体验");
        m7056D().setBackgroundResource(d3c0.Y5);
        xdl0.E0(m7056D(), new View.OnClickListener() { // from class: l.fq80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hq80.m7052x(this.f4485a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m7052x(hq80 hq80Var, View view) {
        hq80Var.dismiss();
        zvf0.r("e_personalized_guide_button", "p_personalized_guide_pop");
        HashMap map = new HashMap();
        map.put("navigation_to", "personalized");
        hq80Var.act.startActivity(CoreModule.l.a().Wf(hq80Var.act, NavigationCardIntent.get("odiamond_private_custom"), map));
    }

    /* JADX INFO: renamed from: y */
    public static void m7053y(hq80 hq80Var) {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static void m7054z(hq80 hq80Var) {
        Window window = hq80Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.e);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m7055A(View view) {
        iq80.m7287a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TextView m7056D() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VDraweeView m7057E() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final TextView m7058F() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final TextView m7059G() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.a);
        }
        e51.G(new Runnable() { // from class: l.eq80
            @Override // java.lang.Runnable
            public final void run() {
                hq80.m7053y(this.f4329a);
            }
        });
        i0e.e(this.pageHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(m6c0.v0, (ViewGroup) null);
        viewInflate.getClass();
        m7055A(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m7051H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m7050C();
        i0e.f(this.pageHelper);
    }
}
