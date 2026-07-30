package p153l;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/a9b0;", "Ll/z4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "register", "()V", "release", OMSTemplateModeType.view, "e", "(Landroid/view/View;)V", "h", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "Ll/ndb0;", "Lv/VText;", "f", "Lv/VText;", "g", "()Lv/VText;", "set_agreement_text", "(Lv/VText;)V", "_agreement_text", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class a9b0 extends AbstractC21759z4 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final ndb0 mediator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _agreement_text;

    /* JADX INFO: renamed from: l.a9b0$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/a9b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15672a implements AbstractC8939a.d {
        public C15672a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            a9b0.this.m96554h();
        }
    }

    /* JADX INFO: renamed from: l.a9b0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/a9b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15673b implements AbstractC8939a.a {
        public C15673b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            a9b0.this.m96554h();
        }
    }

    public a9b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162533c1, root, false);
        viewInflate.getClass();
        m96552e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final void m96552e(View view) {
        b9b0.m103066a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VText m96553g() {
        VText vText = this._agreement_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_agreement_text");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m96554h() {
        CharSequence charSequenceM105323F = bn60.m105323F(j26.m143190c(this.act, h9c0.f108375j));
        if (charSequenceM105323F instanceof Spannable) {
            m96553g().setOnTouchListener(new od0((Spannable) charSequenceM105323F));
        } else {
            m96553g().setOnTouchListener(null);
        }
        m96553g().setText(charSequenceM105323F);
    }

    @Override // p153l.w3m
    public void register() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55194I(new C15672a());
            ndb0Var.m55191F(new C15673b());
        }
    }

    @Override // p153l.w3m
    public void release() {
    }
}
