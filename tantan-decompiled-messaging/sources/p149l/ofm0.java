package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Ll/ofm0;", "Ll/d1v;", "Ll/qfm0;", "Ll/ahm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "Ll/zfm0;", "model", "a", "(Ll/zfm0;)V", "", "withShadow", "F0", "(Z)V", "f", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/cwf0;", "m", "Lkotlin/Lazy;", b2s.C_ZONE, "()Ll/cwf0;", "statPageHelper", "Ll/gur;", "n", "A", "()Ll/gur;", "adapter", "", "o", "B", "()Ljava/util/List;", "pageData", "Ll/y660;", "p", "Ll/y660;", "changeAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ofm0 extends d1v<qfm0<?>> implements ahm0 {

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
    public final y660 changeAdapter;

    /* JADX INFO: renamed from: l.ofm0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/ofm0$a", "Ll/y660;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18926a extends y660 {
        public C18926a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            ofm0.this.f83303j.m77940d(position);
            if (position == 0) {
                P p = ofm0.this.f47706b;
                p.getClass();
                pul0.m171454l("daily_rank", p);
            } else {
                if (position != 1) {
                    return;
                }
                P p2 = ofm0.this.f47706b;
                p2.getClass();
                pul0.m171454l("world_records", p2);
            }
        }
    }

    public ofm0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.statPageHelper = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.jfm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ofm0.m164099x();
            }
        });
        this.adapter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.kfm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ofm0.m164097v(this.f122948a);
            }
        });
        this.pageData = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.lfm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ofm0.m164101z(this.f127904a);
            }
        });
        this.changeAdapter = new C18926a();
    }

    /* JADX INFO: renamed from: B */
    private final List<zfm0> m164096B() {
        return (List) this.pageData.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static gur m164097v(ofm0 ofm0Var) {
        P p = ofm0Var.f47706b;
        p.getClass();
        return new gur((qfm0) p);
    }

    /* JADX INFO: renamed from: w */
    public static Unit m164098w(ofm0 ofm0Var, View view) {
        view.getClass();
        ofm0Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static cwf0 m164099x() {
        return new cwf0("p_audio_auction_rank_list", Reflection.m87507b(ofm0.class).mo87471s());
    }

    /* JADX INFO: renamed from: y */
    public static Unit m164100y(ofm0 ofm0Var, View view) {
        view.getClass();
        ((qfm0) ofm0Var.f47706b).m174365U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static List m164101z(ofm0 ofm0Var) {
        return ((qfm0) ofm0Var.f47706b).m174362R3();
    }

    /* JADX INFO: renamed from: A */
    public final gur m164102A() {
        return (gur) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final cwf0 m164103C() {
        return (cwf0) this.statPageHelper.getValue();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo71722F0(boolean withShadow) {
        super.mo71722F0(withShadow);
        m164103C().m109033i();
        m164103C().m109036l();
    }

    @Override // p149l.ahm0
    /* JADX INFO: renamed from: a */
    public void mo96544a(@NotNull zfm0 model) {
        model.getClass();
        this.f83304k.m4176T(model.getPosition(), true);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: f */
    public void mo71725f() {
        super.mo71725f();
        m164103C().m109035k();
        m164103C().m109034j();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f83304k.m4175P(this.changeAdapter);
        this.f83304k.m4185d(this.changeAdapter);
        this.f83303j.m77941e(m164096B());
        this.f83304k.setOffscreenPageLimit(2);
        this.f83304k.setAdapter(m164102A());
        m164102A().m128072r(m164096B());
        ViewGroup.LayoutParams layoutParams = this.f83299f.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).topMargin = xdl0.m208331F0();
        VImage vImage = this.f83300g;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.mfm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ofm0.m164098w(this.f133602a, (View) obj);
            }
        });
        VImage vImage2 = this.f83302i;
        vImage2.getClass();
        cxq.m109105c(vImage2, new Function1() { // from class: l.nfm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ofm0.m164100y(this.f138804a, (View) obj);
            }
        });
        P p = this.f47706b;
        p.getClass();
        pul0.m171454l("daily_rank", p);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111129q;
    }
}
