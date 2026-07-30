package p149l;

import android.content.Context;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/ngm0;", "Ll/z0v;", "Ll/ygm0;", "Ll/ahm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "Ll/zfm0;", "model", "a", "(Ll/zfm0;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/iur;", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", "A", "()Ll/iur;", "adapter", "", "m", "B", "()Ljava/util/List;", "pageData", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ngm0 extends z0v<ygm0<?>> implements ahm0 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageData;

    /* JADX INFO: renamed from: l.ngm0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/ngm0$a", "Ll/y660;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18693a extends y660 {
        public C18693a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            ngm0.this.f201022i.m77940d(position);
            ngm0.this.m159343A().m138437q(position);
        }
    }

    public ngm0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.adapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.lgm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ngm0.m159339w(this.f128004a);
            }
        });
        this.pageData = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.mgm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ngm0.m159338v(this.f133704a);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static List m159338v(ngm0 ngm0Var) {
        return ((ygm0) ngm0Var.f47706b).m214734R3();
    }

    /* JADX INFO: renamed from: w */
    public static iur m159339w(ngm0 ngm0Var) {
        P p = ngm0Var.f47706b;
        p.getClass();
        return new iur((ygm0) p);
    }

    /* JADX INFO: renamed from: x */
    public static Unit m159340x(ngm0 ngm0Var, View view) {
        view.getClass();
        ((ygm0) ngm0Var.f47706b).m214737U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static Unit m159341y(ngm0 ngm0Var, View view) {
        view.getClass();
        ngm0Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final iur m159343A() {
        return (iur) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final List<zfm0> m159344B() {
        return (List) this.pageData.getValue();
    }

    @Override // p149l.ahm0
    /* JADX INFO: renamed from: a */
    public void mo96544a(@NotNull zfm0 model) {
        model.getClass();
        this.f201023j.m4176T(model.getPosition(), false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f201023j.m4185d(new C18693a());
        this.f201022i.m77941e(m159344B());
        this.f201023j.setOffscreenPageLimit(3);
        this.f201023j.setAdapter(m159343A());
        m159343A().m138439s(m159344B());
        VImage vImage = this.f201019f;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.jgm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ngm0.m159341y(this.f117808a, (View) obj);
            }
        });
        VImage vImage2 = this.f201021h;
        vImage2.getClass();
        cxq.m109105c(vImage2, new Function1() { // from class: l.kgm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ngm0.m159340x(this.f123044a, (View) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }
}
