package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.NoneDefaultDanmakuError;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class om40<D extends ho2> extends gn2<D, sm40> {

    /* JADX INFO: renamed from: j */
    public final nv4 f144582j;

    /* JADX INFO: renamed from: k */
    public BLiveDanmakuList f144583k;

    /* JADX INFO: renamed from: l */
    public BLiveDanmakuListItem f144584l;

    /* JADX INFO: renamed from: m */
    public String f144585m;

    /* JADX INFO: renamed from: n */
    public String f144586n;

    /* JADX INFO: renamed from: o */
    public final bn40 f144587o;

    public om40(bsm<D> bsmVar, nv4 nv4Var, bn40 bn40Var, NormalDanmakuImgViewGroup normalDanmakuImgViewGroup, DanmakuTagViewContainer danmakuTagViewContainer) {
        super(bsmVar);
        this.f144582j = nv4Var;
        mo51532C(new sm40(normalDanmakuImgViewGroup));
        this.f144587o = bn40Var;
        if (ypv.m215672k().m195698O6()) {
            m144512z2(new n1c(bsmVar, danmakuTagViewContainer));
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        this.f144587o.m102749O3(new d30() { // from class: l.lm40
            @Override // p149l.d30
            public final void call() {
                this.f128771a.m165001k4();
            }
        });
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: Y3 */
    public void mo127107Y3(boolean z) {
        super.mo127107Y3(z);
        if (z) {
            ((sm40) this.viewModel).f165324a.setHeightProgress(1.0f);
            ((sm40) this.viewModel).f165324a.setJumpAnimProgressIndex(490);
            ((sm40) this.viewModel).f165324a.setAnimMode(false);
            BLiveDanmakuListItem bLiveDanmakuListItemM165000j4 = m165000j4();
            if (bLiveDanmakuListItemM165000j4 != null) {
                m206028F2().ChatEvent.onDanmakuSelectedItemChange().mo172463j(bLiveDanmakuListItemM165000j4);
            }
        }
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: Z3 */
    public void mo127108Z3(boolean z, int i) {
        super.mo127108Z3(z, i);
        if (!z) {
            float f = i;
            ((sm40) this.viewModel).f165324a.setHeightProgress(1.0f - (f / 180.0f));
            if (f < 80.0f) {
                ((sm40) this.viewModel).f165324a.setAlpProgress(1.0f - (f / 80.0f));
                return;
            }
            return;
        }
        float f2 = i;
        V v2 = this.viewModel;
        if (f2 <= 240.0f) {
            ((sm40) v2).f165324a.setHeightProgress(f2 / 240.0f);
        } else {
            ((sm40) v2).f165324a.setHeightProgress(1.0f);
        }
        if (f2 > 50.0f) {
            ((sm40) this.viewModel).f165324a.setJumpAnimProgressIndex((int) (f2 - 50.0f));
        }
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: a4 */
    public void mo127109a4(boolean z) {
        super.mo127109a4(z);
        if (z) {
            ((sm40) this.viewModel).f165324a.setAlpha(1.0f);
            ((sm40) this.viewModel).f165324a.setHeightProgress(0.0f);
            ((sm40) this.viewModel).f165324a.setAnimMode(true);
            ((sm40) this.viewModel).f165324a.setJumpAnimProgressIndex(0);
            BLiveDanmakuListItem bLiveDanmakuListItemM165000j4 = m165000j4();
            if (bLiveDanmakuListItemM165000j4 != null) {
                m206028F2().ChatEvent.onDanmakuSelectedItemChange().mo172463j(bLiveDanmakuListItemM165000j4);
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m164999i4(String str, String str2) {
        this.f144585m = str;
        this.f144586n = str2;
    }

    /* JADX INFO: renamed from: j4 */
    public BLiveDanmakuListItem m165000j4() {
        if (this.f144583k == null) {
            return null;
        }
        if (this.f144584l == null) {
            y4j0.m212916a("restoreSelectedItemFromSavedValue");
            this.f144584l = m165006p4();
            y4j0.m212917b();
        }
        return this.f144584l;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m165001k4() {
        m165005o4(this.f144587o.getMCurrentDanmakuList());
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m165002l4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        return Boolean.valueOf(TextUtils.equals(bLiveDanmakuListItem.type, this.f144585m) && TextUtils.equals(bLiveDanmakuListItem.subType, this.f144586n));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m165003m4(List list) {
        if (((BLiveDanmakuListItem) vwb.m200346r(list, new w9j() { // from class: l.nm40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139610a.m165002l4((BLiveDanmakuListItem) obj);
            }
        })) == null) {
            return Boolean.FALSE;
        }
        this.f144585m = null;
        this.f144586n = null;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: n4 */
    public void m165004n4(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            lsi0.m151595y(bLiveDanmakuListItem.noPermissionWarnText);
            zvf0.m220399u("e_live_bullet_icon_lock", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("live_id", m206027E2().m149814k()));
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItemM165000j4 = m165000j4();
        if (bLiveDanmakuListItemM165000j4 == null || !bLiveDanmakuListItemM165000j4.equals(bLiveDanmakuListItem)) {
            this.f144584l = bLiveDanmakuListItem;
            ((sm40) this.viewModel).m184937j(bLiveDanmakuListItem);
            m206028F2().ChatEvent.onDanmakuSelectedItemChange().mo172463j(this.f144584l);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m165005o4(BLiveDanmakuList bLiveDanmakuList) {
        BLiveDanmakuListItem bLiveDanmakuListItemM165000j4;
        this.f144583k = bLiveDanmakuList;
        if (!TextUtils.isEmpty(this.f144585m) && !TextUtils.isEmpty(this.f144586n)) {
            vwb.m200346r(vwb.m200324f0(bLiveDanmakuList.fixedTypes, bLiveDanmakuList.floatTypes), new w9j() { // from class: l.mm40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f134548a.m165003m4((List) obj);
                }
            });
        }
        this.f144584l = null;
        ((sm40) this.viewModel).m184938k(bLiveDanmakuList, this.f144582j.m161558q4());
        if (!this.f144582j.m161558q4() || (bLiveDanmakuListItemM165000j4 = m165000j4()) == null) {
            return;
        }
        m206028F2().ChatEvent.onDanmakuSelectedItemChange().mo172463j(bLiveDanmakuListItemM165000j4);
    }

    /* JADX INFO: renamed from: p4 */
    public final BLiveDanmakuListItem m165006p4() {
        BLiveDanmakuListItem bLiveDanmakuListItemFind = this.f144583k.find(new w9j() { // from class: l.jm40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDanmakuListItem) obj).isInUse);
            }
        });
        if (bLiveDanmakuListItemFind == null) {
            bLiveDanmakuListItemFind = this.f144583k.find(new w9j() { // from class: l.km40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TEnum.equals(((BLiveDanmakuListItem) obj).status, "locked"));
                }
            });
        }
        if (bLiveDanmakuListItemFind == null) {
            CrashHelper.m81296c(new NoneDefaultDanmakuError("None item selected by default"));
        }
        return bLiveDanmakuListItemFind;
    }

    /* JADX INFO: renamed from: q4 */
    public void m165007q4(int i) {
        ((sm40) this.viewModel).f165324a.setEditHeight(i);
    }
}
