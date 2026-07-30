package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.api.BottomButtonApi;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qrm0<V extends View> extends qct<rwn0> implements jc3<V> {

    /* JADX INFO: renamed from: i */
    public int f159144i;

    /* JADX INFO: renamed from: j */
    public int f159145j;

    /* JADX INFO: renamed from: k */
    public int f159146k;

    /* JADX INFO: renamed from: l */
    public dum<? extends rwn0> f159147l;

    /* JADX INFO: renamed from: m */
    public BLiveBottomButton f159148m;

    /* JADX INFO: renamed from: n */
    public V f159149n;

    /* JADX INFO: renamed from: o */
    public ic3<?> f159150o;

    /* JADX INFO: renamed from: p */
    public Area f159151p;

    /* JADX INFO: renamed from: q */
    public jxd0 f159152q;

    /* JADX INFO: renamed from: l.qrm0$a */
    public static /* synthetic */ class C19636a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f159153a;

        static {
            int[] iArr = new int[Area.values().length];
            f159153a = iArr;
            try {
                iArr[Area.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159153a[Area.SETTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public qrm0(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar);
        this.f159144i = qa00.m175859d(38.0f);
        this.f159145j = qa00.m175859d(44.0f);
        this.f159147l = dumVar;
        this.f159148m = bLiveBottomButton;
        this.f159151p = area;
        zit zitVar = new zit(bLiveBottomButton.url);
        String strM163315e = zitVar.f112154a;
        if (TextUtils.equals(strM163315e, "showH5")) {
            String strM219937g = zitVar.m219937g("h5Url");
            if (!TextUtils.isEmpty(strM219937g)) {
                strM163315e = niw.m163315e(strM219937g);
            }
        }
        this.f159152q = new jxd0("live_button_red_dot" + zrv.f205799a.m207631D0() + strM163315e, Boolean.FALSE, true);
        m177571N3(((rwn0) dumVar.f90822h).mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: E */
    public int mo112223E() {
        return this.f159148m.redDotCount;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m177571N3(String str) {
        this.f159144i = qa00.m175859d(38.0f);
        this.f159145j = qa00.m175859d(44.0f);
    }

    /* JADX INFO: renamed from: O3 */
    public void m177572O3(int i, boolean z) {
        if (this.f159149n == null) {
            V v2 = (V) mo105688T3(i, z);
            this.f159149n = v2;
            bnl0.m105509E0(v2, new View.OnClickListener() { // from class: l.mrm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f138394a.m177584h4(view);
                }
            });
            this.f159149n.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.nrm0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f143417a.m177585i4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void mo103475P3() {
        if (mo103476l1()) {
            this.f159152q.put(Boolean.TRUE);
            m213811F2().BottomZoneEvent.refreshButton().mo199273j(this.f159151p);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m177573R3(View view, BLiveButtonType bLiveButtonType, String str) {
        mo105691m4(view, bLiveButtonType, str);
        mo103475P3();
        m177574S3(this.f159148m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m177574S3(BLiveBottomButton bLiveBottomButton) {
        if (!bLiveBottomButton.callback || m213810E2() == 0) {
            return;
        }
        duringCreated(BottomButtonApi.patchBottomButtonClick(bLiveBottomButton.f45187id, ((rwn0) m213810E2()).m202191k())).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.orm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148726a.m177586j4((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public abstract V mo105688T3(@DrawableRes int i, boolean z);

    /* JADX INFO: renamed from: U3 */
    public ic3<?> m177575U3(int i, final BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        ic3<?> ic3VarM177576V3 = !wft.m206159b(3) ? m177576V3(i, bLiveSettingButtonCategory) : m177577W3(i, bLiveSettingButtonCategory);
        ic3VarM177576V3.m139428L(this);
        ic3VarM177576V3.m139427K(this.f159148m);
        ic3VarM177576V3.mo113881A(new View.OnClickListener() { // from class: l.prm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153811a.m177587k4(bLiveSettingButtonCategory, view);
            }
        });
        return ic3VarM177576V3;
    }

    /* JADX INFO: renamed from: V3 */
    public final ic3<?> m177576V3(int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        ic3<?> din0Var;
        String strMo107630e4 = mo107630e4(this.f159148m, Area.SETTING);
        if (TextUtils.isEmpty(strMo107630e4)) {
            din0Var = new din0(mo105690c4(), this.f159148m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        } else if (this.f159148m.isGiftSwitch()) {
            din0Var = new vin0(strMo107630e4, this.f159148m.name, i, bLiveSettingButtonCategory);
        } else {
            din0Var = bLiveSettingButtonCategory.viewType == 1 ? new din0(strMo107630e4, this.f159148m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this) : new dho0(strMo107630e4, this.f159148m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        }
        din0Var.m139429N(qa00.m175859d(34.0f));
        return din0Var;
    }

    /* JADX INFO: renamed from: W3 */
    public final ic3<?> m177577W3(int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        String strMo107630e4 = mo107630e4(this.f159148m, Area.SETTING);
        if (TextUtils.isEmpty(strMo107630e4)) {
            return new din0(mo105690c4(), this.f159148m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        }
        if (this.f159148m.isGame()) {
            return new dho0(strMo107630e4, this.f159148m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
        }
        return this.f159148m.isGiftSwitch() ? new vin0(strMo107630e4, this.f159148m.name, i, bLiveSettingButtonCategory) : new din0(strMo107630e4, this.f159148m.name, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name, this);
    }

    /* JADX INFO: renamed from: X3 */
    public V m177578X3() {
        m177572O3(mo105689b4(), true);
        return this.f159149n;
    }

    /* JADX INFO: renamed from: Y3 */
    public int mo177579Y3() {
        return qa00.m175859d(2.0f);
    }

    /* JADX INFO: renamed from: Z3 */
    public int m177580Z3() {
        return this.f159148m.f45187id;
    }

    /* JADX INFO: renamed from: a4 */
    public String mo112224a4() {
        return this.f159148m.type;
    }

    @DrawableRes
    /* JADX INFO: renamed from: b4 */
    public abstract int mo105689b4();

    @DrawableRes
    /* JADX INFO: renamed from: c4 */
    public abstract int mo105690c4();

    /* JADX INFO: renamed from: d4 */
    public View mo177581d4() {
        return this.f159149n;
    }

    /* JADX INFO: renamed from: e4 */
    public String mo107630e4(BLiveBottomButton bLiveBottomButton, Area area) {
        int i = C19636a.f159153a[area.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return "";
            }
        }
        return (jyb.m147479J(bLiveBottomButton.icon) || bLiveBottomButton.icon.size() < i2 + 1) ? "" : bLiveBottomButton.icon.get(i2);
    }

    /* JADX INFO: renamed from: g4 */
    public ic3<?> m177583g4(int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        if (this.f159150o == null) {
            this.f159150o = m177575U3(i, bLiveSettingButtonCategory);
        }
        return this.f159150o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m177584h4(View view) {
        BLiveBottomButton bLiveBottomButton = this.f159148m;
        m177573R3(view, bLiveBottomButton.localType, bLiveBottomButton.url);
        boolean zM183434i3 = ((rwn0) m213810E2()).m183434i3();
        BLiveBottomButton bLiveBottomButton2 = this.f159148m;
        if (zM183434i3) {
            jkp0.m145891v(this, bLiveBottomButton2, this.f159146k);
        } else {
            ptm0.m173769b(this, bLiveBottomButton2, this.f159146k);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ boolean m177585i4(View view) {
        BLiveBottomButton bLiveBottomButton = this.f159148m;
        return m177588l4(view, bLiveBottomButton.localType, bLiveBottomButton.url);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m177586j4(BLiveEnvelope bLiveEnvelope) {
        m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m177587k4(BLiveSettingButtonCategory bLiveSettingButtonCategory, View view) {
        BLiveBottomButton bLiveBottomButton = this.f159148m;
        m177573R3(view, bLiveBottomButton.localType, bLiveBottomButton.url);
        m213811F2().BottomZoneEvent.hideSettingDialog().m199277p();
        if (!wft.m206159b(3) && this.f159148m.labels.contains("latest")) {
            m213811F2().VoiceRecentHistoryEvent.addRecentHistory().mo199273j(this.f159148m.url);
        }
        ptm0.m173770c(this, this.f159148m, bLiveSettingButtonCategory.f45283id);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean mo103476l1() {
        return this.f159148m.enableRedDot && !this.f159152q.get().booleanValue();
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m177588l4(View view, BLiveButtonType bLiveButtonType, String str) {
        boolean zMo177589n4 = mo177589n4(view, bLiveButtonType, str);
        mo103475P3();
        return zMo177589n4;
    }

    /* JADX INFO: renamed from: m4 */
    public abstract void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str);

    /* JADX INFO: renamed from: n4 */
    public boolean mo177589n4(View view, BLiveButtonType bLiveButtonType, String str) {
        return false;
    }

    /* JADX INFO: renamed from: f4 */
    public qct m177582f4() {
        return this;
    }
}
