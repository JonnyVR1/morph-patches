package p002l;

import android.content.Intent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.cwf0;
import l.er2;
import l.l5j0;
import l.qib0;
import l.v7c0;
import l.xh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ll/wzl;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "h", "()V", "Landroid/view/View;", "rootView", "Ll/l5j0;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "", "g", "()Z", "c", "a", "Lcom/p1/mobile/android/app/Act;", "d", "()Lcom/p1/mobile/android/app/Act;", "Ll/cwf0;", "b", "Lkotlin/Lazy;", "f", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class wzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.wzl$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/wzl$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0889a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f22053a;

        public C0889a(l5j0 l5j0Var) {
            this.f22053a = l5j0Var;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f22053a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.wzl$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/wzl$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0890b extends er2 {
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public wzl(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.uzl
            public final Object invoke() {
                return wzl.m25558b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m25557a(wzl wzlVar, View view) {
        wzlVar.m25559c();
    }

    /* JADX INFO: renamed from: b */
    public static cwf0 m25558b() {
        return new cwf0(new C0890b());
    }

    /* JADX INFO: renamed from: c */
    public final void m25559c() {
        Intent intentM1176p2 = ProfileAct.m1176p2(this.act, qib0.b0.a.userId(), "from_intl_pet_photo", false, true);
        intentM1176p2.putExtra("preview_type", 0);
        this.act.startActivity(intentM1176p2);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final l5j0 m25561e(@NotNull Act act, @NotNull View rootView) {
        act.getClass();
        rootView.getClass();
        l5j0 l5j0Var = new l5j0(act, v7c0.d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new C0889a(l5j0Var));
        return l5j0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final cwf0 m25562f() {
        return (cwf0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m25563g() {
        User userP9 = CoreModule.c.e0.p9();
        if (!NullChecker.a(userP9)) {
            return true;
        }
        int size = userP9.pictures.size();
        PutongAct putongAct = this.act;
        if (size < 6) {
            if (!(putongAct instanceof PutongAct)) {
                return true;
            }
            putongAct.pickImagesWithPicker(1, false, false, true, "from_intl_pet_photo");
            return true;
        }
        xh0.a aVar = new xh0.a(putongAct);
        aVar.i(R.string.U8).h(false).e(R.string.T8).q(R.string.S8).o(new View.OnClickListener() { // from class: l.vzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wzl.m25557a(this.f21394a, view);
            }
        });
        aVar.a().g();
        cp60.INSTANCE.m11248g0();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo16142h();
}
