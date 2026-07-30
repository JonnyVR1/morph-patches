package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.NoneDefaultDanmakuError;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.bwr;
import l.d30;
import l.j760;
import l.lsi0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.y4j0;
import l.ypv;
import l.zvf0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class om40<D extends ho2> extends gn2<D, sm40> {

    /* JADX INFO: renamed from: j */
    public final nv4 f16699j;

    /* JADX INFO: renamed from: k */
    public BLiveDanmakuList f16700k;

    /* JADX INFO: renamed from: l */
    public BLiveDanmakuListItem f16701l;

    /* JADX INFO: renamed from: m */
    public String f16702m;

    /* JADX INFO: renamed from: n */
    public String f16703n;

    /* JADX INFO: renamed from: o */
    public final bn40 f16704o;

    public om40(bsm<D> bsmVar, nv4 nv4Var, bn40 bn40Var, NormalDanmakuImgViewGroup normalDanmakuImgViewGroup, DanmakuTagViewContainer danmakuTagViewContainer) {
        super(bsmVar);
        this.f16699j = nv4Var;
        C(new sm40(normalDanmakuImgViewGroup));
        this.f16704o = bn40Var;
        if (ypv.k().O6()) {
            z2(new n1c(bsmVar, danmakuTagViewContainer));
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        this.f16704o.m10519O3(new d30() { // from class: l.lm40
            public final void call() {
                this.f14951a.m19617k4();
            }
        });
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: Y3 */
    public void mo13961Y3(boolean z) {
        super.mo13961Y3(z);
        if (z) {
            ((sm40) ((bwr) this).viewModel).f19121a.setHeightProgress(1.0f);
            ((sm40) ((bwr) this).viewModel).f19121a.setJumpAnimProgressIndex(490);
            ((sm40) ((bwr) this).viewModel).f19121a.setAnimMode(false);
            BLiveDanmakuListItem bLiveDanmakuListItemM19616j4 = m19616j4();
            if (bLiveDanmakuListItemM19616j4 != null) {
                m25548F2().ChatEvent.onDanmakuSelectedItemChange().j(bLiveDanmakuListItemM19616j4);
            }
        }
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: Z3 */
    public void mo13962Z3(boolean z, int i) {
        super.mo13962Z3(z, i);
        if (!z) {
            float f = i;
            ((sm40) ((bwr) this).viewModel).f19121a.setHeightProgress(1.0f - (f / 180.0f));
            if (f < 80.0f) {
                ((sm40) ((bwr) this).viewModel).f19121a.setAlpProgress(1.0f - (f / 80.0f));
                return;
            }
            return;
        }
        float f2 = i;
        s7m s7mVar = ((bwr) this).viewModel;
        if (f2 <= 240.0f) {
            ((sm40) s7mVar).f19121a.setHeightProgress(f2 / 240.0f);
        } else {
            ((sm40) s7mVar).f19121a.setHeightProgress(1.0f);
        }
        if (f2 > 50.0f) {
            ((sm40) ((bwr) this).viewModel).f19121a.setJumpAnimProgressIndex((int) (f2 - 50.0f));
        }
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: a4 */
    public void mo13963a4(boolean z) {
        super.mo13963a4(z);
        if (z) {
            ((sm40) ((bwr) this).viewModel).f19121a.setAlpha(1.0f);
            ((sm40) ((bwr) this).viewModel).f19121a.setHeightProgress(0.0f);
            ((sm40) ((bwr) this).viewModel).f19121a.setAnimMode(true);
            ((sm40) ((bwr) this).viewModel).f19121a.setJumpAnimProgressIndex(0);
            BLiveDanmakuListItem bLiveDanmakuListItemM19616j4 = m19616j4();
            if (bLiveDanmakuListItemM19616j4 != null) {
                m25548F2().ChatEvent.onDanmakuSelectedItemChange().j(bLiveDanmakuListItemM19616j4);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m19615i4(String str, String str2) {
        this.f16702m = str;
        this.f16703n = str2;
    }

    /* JADX INFO: renamed from: j4 */
    public BLiveDanmakuListItem m19616j4() {
        if (this.f16700k == null) {
            return null;
        }
        if (this.f16701l == null) {
            y4j0.a("restoreSelectedItemFromSavedValue");
            this.f16701l = m19622p4();
            y4j0.b();
        }
        return this.f16701l;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m19617k4() {
        m19621o4(this.f16704o.getMCurrentDanmakuList());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m19618l4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        return Boolean.valueOf(TextUtils.equals(bLiveDanmakuListItem.type, this.f16702m) && TextUtils.equals(bLiveDanmakuListItem.subType, this.f16703n));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m19619m4(List list) {
        if (((BLiveDanmakuListItem) vwb.r(list, new w9j() { // from class: l.nm40
            public final Object call(Object obj) {
                return this.f16103a.m19618l4((BLiveDanmakuListItem) obj);
            }
        })) == null) {
            return Boolean.FALSE;
        }
        this.f16702m = null;
        this.f16703n = null;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: n4 */
    public void m19620n4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            lsi0.y(bLiveDanmakuListItem.noPermissionWarnText);
            zvf0.u("e_live_bullet_icon_lock", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("bullet_type", bLiveDanmakuListItem.type), vwb.Y("live_id", m25547E2().m17235k())});
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItemM19616j4 = m19616j4();
        if (bLiveDanmakuListItemM19616j4 == null || !bLiveDanmakuListItemM19616j4.equals(bLiveDanmakuListItem)) {
            this.f16701l = bLiveDanmakuListItem;
            ((sm40) ((bwr) this).viewModel).m22571j(bLiveDanmakuListItem);
            m25548F2().ChatEvent.onDanmakuSelectedItemChange().j(this.f16701l);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m19621o4(BLiveDanmakuList bLiveDanmakuList) {
        BLiveDanmakuListItem bLiveDanmakuListItemM19616j4;
        this.f16700k = bLiveDanmakuList;
        if (!TextUtils.isEmpty(this.f16702m) && !TextUtils.isEmpty(this.f16703n)) {
            vwb.r(vwb.f0(new List[]{bLiveDanmakuList.fixedTypes, bLiveDanmakuList.floatTypes}), new w9j() { // from class: l.mm40
                public final Object call(Object obj) {
                    return this.f15454a.m19619m4((List) obj);
                }
            });
        }
        this.f16701l = null;
        ((sm40) ((bwr) this).viewModel).m22572k(bLiveDanmakuList, this.f16699j.m19046q4());
        if (!this.f16699j.m19046q4() || (bLiveDanmakuListItemM19616j4 = m19616j4()) == null) {
            return;
        }
        m25548F2().ChatEvent.onDanmakuSelectedItemChange().j(bLiveDanmakuListItemM19616j4);
    }

    /* JADX INFO: renamed from: p4 */
    public final BLiveDanmakuListItem m19622p4() {
        BLiveDanmakuListItem bLiveDanmakuListItemFind = this.f16700k.find(new w9j() { // from class: l.jm40
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDanmakuListItem) obj).isInUse);
            }
        });
        if (bLiveDanmakuListItemFind == null) {
            bLiveDanmakuListItemFind = this.f16700k.find(new w9j() { // from class: l.km40
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TEnum.equals(((BLiveDanmakuListItem) obj).status, "locked"));
                }
            });
        }
        if (bLiveDanmakuListItemFind == null) {
            CrashHelper.c(new NoneDefaultDanmakuError("None item selected by default"));
        }
        return bLiveDanmakuListItemFind;
    }

    /* JADX INFO: renamed from: q4 */
    public void m19623q4(int i) {
        ((sm40) ((bwr) this).viewModel).f19121a.setEditHeight(i);
    }
}
