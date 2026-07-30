package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m88121d2 = {"Ll/som0;", "Ll/e3v;", "Ll/uom0;", "Ll/eqm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "Ll/dpm0;", "model", "a", "(Ll/dpm0;)V", "", "withShadow", "F0", "(Z)V", "f", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/l4g0;", "m", "Lkotlin/Lazy;", c4s.C_ZONE, "()Ll/l4g0;", "statPageHelper", "Ll/hwr;", "n", "A", "()Ll/hwr;", "adapter", "", "o", "B", "()Ljava/util/List;", "pageData", "Ll/ef60;", "p", "Ll/ef60;", "changeAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class som0 extends e3v<uom0<?>> implements eqm0 {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy statPageHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final ef60 changeAdapter;

    /* JADX INFO: renamed from: l.som0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/som0$a", "Ll/ef60;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20125a extends ef60 {
        public C20125a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            som0.this.f92009j.m79123d(position);
            if (position == 0) {
                P p = som0.this.f48554b;
                p.getClass();
                t3m0.m189098l("daily_rank", p);
            } else {
                if (position != 1) {
                    return;
                }
                P p2 = som0.this.f48554b;
                p2.getClass();
                t3m0.m189098l("world_records", p2);
            }
        }
    }

    public som0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.statPageHelper = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.nom0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return som0.m187252x();
            }
        });
        this.adapter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.oom0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return som0.m187250v(this.f148383a);
            }
        });
        this.pageData = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.pom0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return som0.m187254z(this.f153416a);
            }
        });
        this.changeAdapter = new C20125a();
    }

    /* JADX INFO: renamed from: B */
    private final List<dpm0> m187249B() {
        return (List) this.pageData.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static hwr m187250v(som0 som0Var) {
        P p = som0Var.f48554b;
        p.getClass();
        return new hwr((uom0) p);
    }

    /* JADX INFO: renamed from: w */
    public static Unit m187251w(som0 som0Var, View view) {
        view.getClass();
        som0Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static l4g0 m187252x() {
        return new l4g0("p_audio_auction_rank_list", Reflection.m88396b(som0.class).mo88360s());
    }

    /* JADX INFO: renamed from: y */
    public static Unit m187253y(som0 som0Var, View view) {
        view.getClass();
        ((uom0) som0Var.f48554b).m197001U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static List m187254z(som0 som0Var) {
        return ((uom0) som0Var.f48554b).m196998R3();
    }

    /* JADX INFO: renamed from: A */
    public final hwr m187255A() {
        return (hwr) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final l4g0 m187256C() {
        return (l4g0) this.statPageHelper.getValue();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    /* JADX INFO: renamed from: F0 */
    public void mo72905F0(boolean withShadow) {
        super.mo72905F0(withShadow);
        m187256C().m152774i();
        m187256C().m152777l();
    }

    @Override // p153l.eqm0
    /* JADX INFO: renamed from: a */
    public void mo121948a(@NotNull dpm0 model) {
        model.getClass();
        this.f92010k.m4178T(model.getPosition(), true);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: f */
    public void mo72908f() {
        super.mo72908f();
        m187256C().m152776k();
        m187256C().m152775j();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f92010k.m4177P(this.changeAdapter);
        this.f92010k.m4187d(this.changeAdapter);
        this.f92009j.m79124e(m187249B());
        this.f92010k.setOffscreenPageLimit(2);
        this.f92010k.setAdapter(m187255A());
        m187255A().m137503r(m187249B());
        ViewGroup.LayoutParams layoutParams = this.f92005f.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).topMargin = bnl0.m105511F0();
        VImage vImage = this.f92006g;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.qom0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return som0.m187251w(this.f158743a, (View) obj);
            }
        });
        VImage vImage2 = this.f92008i;
        vImage2.getClass();
        czq.m113347c(vImage2, new Function1() { // from class: l.rom0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return som0.m187253y(this.f164218a, (View) obj);
            }
        });
        P p = this.f48554b;
        p.getClass();
        t3m0.m189098l("daily_rank", p);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146457q;
    }
}
