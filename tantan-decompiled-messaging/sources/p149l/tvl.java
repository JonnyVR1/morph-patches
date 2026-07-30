package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/tvl;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "rootView", "Ll/l5j0;", "c", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "a", "Lcom/p1/mobile/android/app/Act;", "b", "()Lcom/p1/mobile/android/app/Act;", "Ll/cwf0;", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class tvl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.tvl$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/tvl$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20296a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f172319a;

        public C20296a(l5j0 l5j0Var) {
            this.f172319a = l5j0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f172319a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.tvl$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/tvl$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20297b extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return ubo.INSTANCE.m192887h();
        }
    }

    public tvl(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.svl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tvl.m190751a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static cwf0 m190751a() {
        return new cwf0(new C20297b());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final l5j0 m190753c(@NotNull Act act, @NotNull View rootView) {
        act.getClass();
        rootView.getClass();
        l5j0 l5j0Var = new l5j0(act, v7c0.f180357d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new C20296a(l5j0Var));
        return l5j0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final cwf0 m190754d() {
        return (cwf0) this.pageHelp.getValue();
    }
}
