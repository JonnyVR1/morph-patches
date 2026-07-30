package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.api.BottomButtonApi;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mim0<V extends View> extends pat<nnn0> implements ub3<V> {

    /* JADX INFO: renamed from: i */
    public int f134015i;

    /* JADX INFO: renamed from: j */
    public int f134016j;

    /* JADX INFO: renamed from: k */
    public int f134017k;

    /* JADX INFO: renamed from: l */
    public bsm<? extends nnn0> f134018l;

    /* JADX INFO: renamed from: m */
    public BLiveBottomButton f134019m;

    /* JADX INFO: renamed from: n */
    public V f134020n;

    /* JADX INFO: renamed from: o */
    public tb3<?> f134021o;

    /* JADX INFO: renamed from: p */
    public Area f134022p;

    /* JADX INFO: renamed from: q */
    public hpd0 f134023q;

    /* JADX INFO: renamed from: l.mim0$a */
    public static /* synthetic */ class C18463a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134024a;

        static {
            int[] iArr = new int[Area.values().length];
            f134024a = iArr;
            try {
                iArr[Area.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f134024a[Area.SETTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public mim0(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar);
        this.f134015i = t100.m186890d(38.0f);
        this.f134016j = t100.m186890d(44.0f);
        this.f134018l = bsmVar;
        this.f134019m = bLiveBottomButton;
        this.f134022p = area;
        ygt ygtVar = new ygt(bLiveBottomButton.url);
        String strM164284e = ygtVar.f104769a;
        if (TextUtils.equals(strM164284e, "showH5")) {
            String strM214763g = ygtVar.m214763g("h5Url");
            if (!TextUtils.isEmpty(strM214763g)) {
                strM164284e = ogw.m164284e(strM214763g);
            }
        }
        this.f134023q = new hpd0("live_button_red_dot" + ypv.f199493a.m199309D0() + strM164284e, Boolean.FALSE, true);
        m154723N3(((nnn0) bsmVar.f77102h).mo149813j().liveMode);
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: E */
    public int mo154722E() {
        return this.f134019m.redDotCount;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m154723N3(String str) {
        this.f134015i = t100.m186890d(38.0f);
        this.f134016j = t100.m186890d(44.0f);
    }

    /* JADX INFO: renamed from: O3 */
    public void m154724O3(int i, boolean z) {
        if (this.f134020n == null) {
            V v2 = (V) mo108804T3(i, z);
            this.f134020n = v2;
            xdl0.m208329E0(v2, new View.OnClickListener() { // from class: l.iim0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113415a.m154737h4(view);
                }
            });
            this.f134020n.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jim0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f118117a.m154738i4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void mo154725P3() {
        if (mo108806l1()) {
            this.f134023q.put(Boolean.TRUE);
            m206028F2().BottomZoneEvent.refreshButton().mo172463j(this.f134022p);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m154726R3(View view, BLiveButtonType bLiveButtonType, String str) {
        mo116707m4(view, bLiveButtonType, str);
        mo154725P3();
        m154727S3(this.f134019m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m154727S3(BLiveBottomButton bLiveBottomButton) {
        if (!bLiveBottomButton.callback || m206027E2() == 0) {
            return;
        }
        duringCreated(BottomButtonApi.patchBottomButtonClick(bLiveBottomButton.f44339id, ((nnn0) m206027E2()).m149814k())).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.kim0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123358a.m154739j4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public abstract V mo108804T3(@DrawableRes int i, boolean z);

    /* JADX INFO: renamed from: U3 */
    public tb3<?> m154728U3(int i, final BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        tb3<?> tb3VarM154729V3 = !vdt.m198092b(3) ? m154729V3(i, bLiveSettingButtonCategory) : m154730W3(i, bLiveSettingButtonCategory);
        tb3VarM154729V3.m187795L(this);
        tb3VarM154729V3.m187794K(this.f134019m);
        tb3VarM154729V3.mo109662A(new View.OnClickListener() { // from class: l.lim0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128232a.m154740k4(bLiveSettingButtonCategory, view);
            }
        });
        return tb3VarM154729V3;
    }

    /* JADX INFO: renamed from: V3 */
    public final tb3<?> m154729V3(int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        tb3<?> z8n0Var;
        String strMo154734e4 = mo154734e4(this.f134019m, Area.SETTING);
        if (TextUtils.isEmpty(strMo154734e4)) {
            z8n0Var = new z8n0(mo116705c4(), this.f134019m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        } else if (this.f134019m.isGiftSwitch()) {
            z8n0Var = new r9n0(strMo154734e4, this.f134019m.name, i, bLiveSettingButtonCategory);
        } else {
            z8n0Var = bLiveSettingButtonCategory.viewType == 1 ? new z8n0(strMo154734e4, this.f134019m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this) : new z7o0(strMo154734e4, this.f134019m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        }
        z8n0Var.m187796N(t100.m186890d(34.0f));
        return z8n0Var;
    }

    /* JADX INFO: renamed from: W3 */
    public final tb3<?> m154730W3(int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        String strMo154734e4 = mo154734e4(this.f134019m, Area.SETTING);
        if (TextUtils.isEmpty(strMo154734e4)) {
            return new z8n0(mo116705c4(), this.f134019m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        }
        if (this.f134019m.isGame()) {
            return new z7o0(strMo154734e4, this.f134019m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        }
        return this.f134019m.isGiftSwitch() ? new r9n0(strMo154734e4, this.f134019m.name, i, bLiveSettingButtonCategory) : new z8n0(strMo154734e4, this.f134019m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
    }

    /* JADX INFO: renamed from: X3 */
    public V m154731X3() {
        m154724O3(mo116704b4(), true);
        return this.f134020n;
    }

    /* JADX INFO: renamed from: Y3 */
    public int mo116703Y3() {
        return t100.m186890d(2.0f);
    }

    /* JADX INFO: renamed from: Z3 */
    public int m154732Z3() {
        return this.f134019m.f44339id;
    }

    /* JADX INFO: renamed from: a4 */
    public String mo154733a4() {
        return this.f134019m.type;
    }

    @DrawableRes
    /* JADX INFO: renamed from: b4 */
    public abstract int mo116704b4();

    @DrawableRes
    /* JADX INFO: renamed from: c4 */
    public abstract int mo116705c4();

    /* JADX INFO: renamed from: d4 */
    public View mo116706d4() {
        return this.f134020n;
    }

    /* JADX INFO: renamed from: e4 */
    public String mo154734e4(BLiveBottomButton bLiveBottomButton, Area area) {
        int i = C18463a.f134024a[area.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return "";
            }
        }
        return (vwb.m200296J(bLiveBottomButton.icon) || bLiveBottomButton.icon.size() < i2 + 1) ? "" : bLiveBottomButton.icon.get(i2);
    }

    /* JADX INFO: renamed from: g4 */
    public tb3<?> m154736g4(int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        if (this.f134021o == null) {
            this.f134021o = m154728U3(i, bLiveSettingButtonCategory);
        }
        return this.f134021o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m154737h4(View view) {
        BLiveBottomButton bLiveBottomButton = this.f134019m;
        m154726R3(view, bLiveBottomButton.localType, bLiveBottomButton.url);
        boolean zM160271i3 = ((nnn0) m206027E2()).m160271i3();
        BLiveBottomButton bLiveBottomButton2 = this.f134019m;
        if (zM160271i3) {
            fbp0.m120406v(this, bLiveBottomButton2, this.f134017k);
        } else {
            lkm0.m150374b(this, bLiveBottomButton2, this.f134017k);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ boolean m154738i4(View view) {
        BLiveBottomButton bLiveBottomButton = this.f134019m;
        return m154741l4(view, bLiveBottomButton.localType, bLiveBottomButton.url);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m154739j4(BLiveEnvelope bLiveEnvelope) {
        m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m154740k4(BLiveSettingButtonCategory bLiveSettingButtonCategory, View view) {
        BLiveBottomButton bLiveBottomButton = this.f134019m;
        m154726R3(view, bLiveBottomButton.localType, bLiveBottomButton.url);
        m206028F2().BottomZoneEvent.hideSettingDialog().m172467p();
        if (!vdt.m198092b(3) && this.f134019m.labels.contains("latest")) {
            m206028F2().VoiceRecentHistoryEvent.addRecentHistory().mo172463j(this.f134019m.url);
        }
        lkm0.m150375c(this, this.f134019m, bLiveSettingButtonCategory.f44435id);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean mo108806l1() {
        return this.f134019m.enableRedDot && !this.f134023q.get().booleanValue();
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m154741l4(View view, BLiveButtonType bLiveButtonType, String str) {
        boolean zMo116708n4 = mo116708n4(view, bLiveButtonType, str);
        mo154725P3();
        return zMo116708n4;
    }

    /* JADX INFO: renamed from: m4 */
    public abstract void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str);

    /* JADX INFO: renamed from: n4 */
    public boolean mo116708n4(View view, BLiveButtonType bLiveButtonType, String str) {
        return false;
    }

    /* JADX INFO: renamed from: f4 */
    public pat m154735f4() {
        return this;
    }
}
