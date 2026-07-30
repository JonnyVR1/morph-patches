package p149l;

import android.content.Intent;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/wzl;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "h", "()V", "Landroid/view/View;", "rootView", "Ll/l5j0;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "", "g", "()Z", "c", "a", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/android/app/Act;", "Ll/cwf0;", "b", "Lkotlin/Lazy;", "f", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class wzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.wzl$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/wzl$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21007a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f188741a;

        public C21007a(l5j0 l5j0Var) {
            this.f188741a = l5j0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f188741a.m101651T();
            }
        }
    }

    /* JADX INFO: renamed from: l.wzl$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/wzl$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21008b extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public wzl(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.uzl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return wzl.m206292b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m206291a(wzl wzlVar, View view) {
        wzlVar.m206293c();
    }

    /* JADX INFO: renamed from: b */
    public static cwf0 m206292b() {
        return new cwf0(new C21008b());
    }

    /* JADX INFO: renamed from: c */
    public final void m206293c() {
        Intent intentM50738p2 = ProfileAct.m50738p2(this.act, qib0.f154713b0.f139230a.userId(), "from_intl_pet_photo", false, true);
        intentM50738p2.putExtra("preview_type", 0);
        this.act.startActivity(intentM50738p2);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final l5j0 m206295e(@NotNull Act act, @NotNull View rootView) {
        act.getClass();
        rootView.getClass();
        l5j0 l5j0Var = new l5j0(act, v7c0.f180357d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new C21007a(l5j0Var));
        return l5j0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final cwf0 m206296f() {
        return (cwf0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m206297g() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9)) {
            return true;
        }
        int size = userM169527p9.pictures.size();
        Act act = this.act;
        if (size < 6) {
            if (!(act instanceof PutongAct)) {
                return true;
            }
            ((PutongAct) act).pickImagesWithPicker(1, false, false, true, "from_intl_pet_photo");
            return true;
        }
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208730i(R$string.f18175U8).m208729h(false).m208726e(R$string.f18145T8).m208738q(R$string.f18115S8).m208736o(new View.OnClickListener() { // from class: l.vzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wzl.m206291a(this.f183648a, view);
            }
        });
        c21150a.m208722a().m208721g();
        cp60.INSTANCE.m108091g0();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo142646h();
}
