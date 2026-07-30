package p149l;

import android.content.Context;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
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
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/fgm0;", "Ll/g1v;", "Ll/hgm0;", "Ll/ahm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "Ll/zfm0;", "model", "a", "(Ll/zfm0;)V", "j", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/hur;", "Lkotlin/Lazy;", BaseSei.f13932Z, "()Ll/hur;", "adapter", "", BLiveStormDanmakuGiftResourceType.f44444l, "A", "()Ljava/util/List;", "pageData", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class fgm0 extends g1v<hgm0<?>> implements ahm0 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageData;

    /* JADX INFO: renamed from: l.fgm0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/fgm0$a", "Ll/y660;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16820a extends y660 {
        public C16820a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            fgm0.this.f100211h.m77940d(position);
            fgm0.this.m121266z().m133142q(position);
        }
    }

    public fgm0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.adapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.dgm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fgm0.m121262v(this.f86117a);
            }
        });
        this.pageData = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.egm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fgm0.m121264x(this.f90964a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final List<zfm0> m121261A() {
        return (List) this.pageData.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static hur m121262v(fgm0 fgm0Var) {
        P p = fgm0Var.f47706b;
        p.getClass();
        return new hur((hgm0) p);
    }

    /* JADX INFO: renamed from: w */
    public static Unit m121263w(fgm0 fgm0Var, View view) {
        view.getClass();
        fgm0Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static List m121264x(fgm0 fgm0Var) {
        return ((hgm0) fgm0Var.f47706b).m130840R3();
    }

    @Override // p149l.ahm0
    /* JADX INFO: renamed from: a */
    public void mo96544a(@NotNull zfm0 model) {
        model.getClass();
        this.f100212i.m4176T(model.getPosition(), false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f100212i.m4185d(new C16820a());
        this.f100211h.m77941e(m121261A());
        if (this.f100212i.getCurrentItem() == 0) {
            m121266z().m133142q(0);
        } else {
            this.f100212i.m4176T(0, false);
        }
        this.f100212i.setOffscreenPageLimit(3);
        this.f100212i.setAdapter(m121266z());
        m121266z().m133144s(m121261A());
        VImage vImage = this.f100209f;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.cgm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fgm0.m121263w(this.f80783a, (View) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: z */
    public final hur m121266z() {
        return (hur) this.adapter.getValue();
    }
}
