package p153l;

import android.content.Intent;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/q2m;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "h", "()V", "Landroid/view/View;", "rootView", "Ll/pej0;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", "", "g", "()Z", "c", "a", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/android/app/Act;", "Ll/l4g0;", "b", "Lkotlin/Lazy;", "f", "()Ll/l4g0;", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class q2m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.q2m$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/q2m$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19510a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f155354a;

        public C19510a(pej0 pej0Var) {
            this.f155354a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f155354a.m176562T();
            }
        }
    }

    /* JADX INFO: renamed from: l.q2m$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/q2m$b", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19511b extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public q2m(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.o2m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q2m.m175054b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m175053a(q2m q2mVar, View view) {
        q2mVar.m175055c();
    }

    /* JADX INFO: renamed from: b */
    public static l4g0 m175054b() {
        return new l4g0(new C19511b());
    }

    /* JADX INFO: renamed from: c */
    public final void m175055c() {
        Intent intentM51922q2 = ProfileAct.m51922q2(this.act, uqb0.f180396b0.f170324a.userId(), "from_intl_pet_photo", false, true);
        intentM51922q2.putExtra("preview_type", 0);
        this.act.startActivity(intentM51922q2);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final pej0 m175057e(@NotNull Act act, @NotNull View rootView) {
        act.getClass();
        rootView.getClass();
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().setPeekHeight(0);
        pej0Var.getBehavior().setSkipCollapsed(true);
        pej0Var.getBehavior().addBottomSheetCallback(new C19510a(pej0Var));
        return pej0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final l4g0 m175058f() {
        return (l4g0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m175059g() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9)) {
            return true;
        }
        int size = userM116600p9.pictures.size();
        Act act = this.act;
        if (size < 6) {
            if (!(act instanceof PutongAct)) {
                return true;
            }
            ((PutongAct) act).pickImagesWithPicker(1, false, false, true, "from_intl_pet_photo");
            return true;
        }
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191150i(R$string.f18965W8).m191149h(false).m191146e(R$string.f18935V8).m191158q(R$string.f18905U8).m191156o(new View.OnClickListener() { // from class: l.p2m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q2m.m175053a(this.f150280a, view);
            }
        });
        c20312a.m191142a().m191141g();
        ix60.INSTANCE.m142474g0();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo123016h();
}
