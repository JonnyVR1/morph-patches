package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.NoneDefaultDanmakuError;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class cv40<D extends oo2> extends nn2<D, gv40> {

    /* JADX INFO: renamed from: j */
    public final mw4 f83940j;

    /* JADX INFO: renamed from: k */
    public BLiveDanmakuList f83941k;

    /* JADX INFO: renamed from: l */
    public BLiveDanmakuListItem f83942l;

    /* JADX INFO: renamed from: m */
    public String f83943m;

    /* JADX INFO: renamed from: n */
    public String f83944n;

    /* JADX INFO: renamed from: o */
    public final pv40 f83945o;

    public cv40(dum<D> dumVar, mw4 mw4Var, pv40 pv40Var, NormalDanmakuImgViewGroup normalDanmakuImgViewGroup, DanmakuTagViewContainer danmakuTagViewContainer) {
        super(dumVar);
        this.f83940j = mw4Var;
        mo52715C(new gv40(normalDanmakuImgViewGroup));
        this.f83945o = pv40Var;
        if (zrv.m221193k().m203485O6()) {
            m153103z2(new a3c(dumVar, danmakuTagViewContainer));
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        this.f83945o.m173924O3(new x20() { // from class: l.zu40
            @Override // p153l.x20
            public final void call() {
                this.f206090a.m112752k4();
            }
        });
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: Y3 */
    public void mo95792Y3(boolean z) {
        super.mo95792Y3(z);
        if (z) {
            ((gv40) this.viewModel).f106602a.setHeightProgress(1.0f);
            ((gv40) this.viewModel).f106602a.setJumpAnimProgressIndex(490);
            ((gv40) this.viewModel).f106602a.setAnimMode(false);
            BLiveDanmakuListItem bLiveDanmakuListItemM112751j4 = m112751j4();
            if (bLiveDanmakuListItemM112751j4 != null) {
                m213811F2().ChatEvent.onDanmakuSelectedItemChange().mo199273j(bLiveDanmakuListItemM112751j4);
            }
        }
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: Z3 */
    public void mo95793Z3(boolean z, int i) {
        super.mo95793Z3(z, i);
        if (!z) {
            float f = i;
            ((gv40) this.viewModel).f106602a.setHeightProgress(1.0f - (f / 180.0f));
            if (f < 80.0f) {
                ((gv40) this.viewModel).f106602a.setAlpProgress(1.0f - (f / 80.0f));
                return;
            }
            return;
        }
        float f2 = i;
        V v2 = this.viewModel;
        if (f2 <= 240.0f) {
            ((gv40) v2).f106602a.setHeightProgress(f2 / 240.0f);
        } else {
            ((gv40) v2).f106602a.setHeightProgress(1.0f);
        }
        if (f2 > 50.0f) {
            ((gv40) this.viewModel).f106602a.setJumpAnimProgressIndex((int) (f2 - 50.0f));
        }
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: a4 */
    public void mo112749a4(boolean z) {
        super.mo112749a4(z);
        if (z) {
            ((gv40) this.viewModel).f106602a.setAlpha(1.0f);
            ((gv40) this.viewModel).f106602a.setHeightProgress(0.0f);
            ((gv40) this.viewModel).f106602a.setAnimMode(true);
            ((gv40) this.viewModel).f106602a.setJumpAnimProgressIndex(0);
            BLiveDanmakuListItem bLiveDanmakuListItemM112751j4 = m112751j4();
            if (bLiveDanmakuListItemM112751j4 != null) {
                m213811F2().ChatEvent.onDanmakuSelectedItemChange().mo199273j(bLiveDanmakuListItemM112751j4);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m112750i4(String str, String str2) {
        this.f83943m = str;
        this.f83944n = str2;
    }

    /* JADX INFO: renamed from: j4 */
    public BLiveDanmakuListItem m112751j4() {
        if (this.f83941k == null) {
            return null;
        }
        if (this.f83942l == null) {
            cej0.m109373a("restoreSelectedItemFromSavedValue");
            this.f83942l = m112757p4();
            cej0.m109374b();
        }
        return this.f83942l;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m112752k4() {
        m112756o4(this.f83945o.getMCurrentDanmakuList());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m112753l4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        return Boolean.valueOf(TextUtils.equals(bLiveDanmakuListItem.type, this.f83943m) && TextUtils.equals(bLiveDanmakuListItem.subType, this.f83944n));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m112754m4(List list) {
        if (((BLiveDanmakuListItem) jyb.m147529r(list, new qcj() { // from class: l.bv40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f78570a.m112753l4((BLiveDanmakuListItem) obj);
            }
        })) == null) {
            return Boolean.FALSE;
        }
        this.f83943m = null;
        this.f83944n = null;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: n4 */
    public void m112755n4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            o1j0.m165651y(bLiveDanmakuListItem.noPermissionWarnText);
            i4g0.m138523u("e_live_bullet_icon_lock", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("live_id", m213810E2().m202191k()));
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItemM112751j4 = m112751j4();
        if (bLiveDanmakuListItemM112751j4 == null || !bLiveDanmakuListItemM112751j4.equals(bLiveDanmakuListItem)) {
            this.f83942l = bLiveDanmakuListItem;
            ((gv40) this.viewModel).m132489j(bLiveDanmakuListItem);
            m213811F2().ChatEvent.onDanmakuSelectedItemChange().mo199273j(this.f83942l);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m112756o4(BLiveDanmakuList bLiveDanmakuList) {
        BLiveDanmakuListItem bLiveDanmakuListItemM112751j4;
        this.f83941k = bLiveDanmakuList;
        if (!TextUtils.isEmpty(this.f83943m) && !TextUtils.isEmpty(this.f83944n)) {
            jyb.m147529r(jyb.m147507f0(bLiveDanmakuList.fixedTypes, bLiveDanmakuList.floatTypes), new qcj() { // from class: l.av40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f73584a.m112754m4((List) obj);
                }
            });
        }
        this.f83942l = null;
        ((gv40) this.viewModel).m132490k(bLiveDanmakuList, this.f83940j.m160444q4());
        if (!this.f83940j.m160444q4() || (bLiveDanmakuListItemM112751j4 = m112751j4()) == null) {
            return;
        }
        m213811F2().ChatEvent.onDanmakuSelectedItemChange().mo199273j(bLiveDanmakuListItemM112751j4);
    }

    /* JADX INFO: renamed from: p4 */
    public final BLiveDanmakuListItem m112757p4() {
        BLiveDanmakuListItem bLiveDanmakuListItemFind = this.f83941k.find(new qcj() { // from class: l.xu40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDanmakuListItem) obj).isInUse);
            }
        });
        if (bLiveDanmakuListItemFind == null) {
            bLiveDanmakuListItemFind = this.f83941k.find(new qcj() { // from class: l.yu40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TEnum.equals(((BLiveDanmakuListItem) obj).status, "locked"));
                }
            });
        }
        if (bLiveDanmakuListItemFind == null) {
            CrashHelper.m82479c(new NoneDefaultDanmakuError("None item selected by default"));
        }
        return bLiveDanmakuListItemFind;
    }

    /* JADX INFO: renamed from: q4 */
    public void m112758q4(int i) {
        ((gv40) this.viewModel).f106602a.setEditHeight(i);
    }
}
