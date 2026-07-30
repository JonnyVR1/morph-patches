package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListDivideItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListFixItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListShadowItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gv40 implements iam<cv40<dw40>> {

    /* JADX INFO: renamed from: a */
    public final NormalDanmakuImgViewGroup f106602a;

    /* JADX INFO: renamed from: b */
    public cv40<dw40> f106603b;

    public gv40(NormalDanmakuImgViewGroup normalDanmakuImgViewGroup) {
        this.f106602a = normalDanmakuImgViewGroup;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106603b.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cv40<dw40> cv40Var) {
        this.f106603b = cv40Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m132486e(BLiveDanmakuListItem bLiveDanmakuListItem, NormalDanmakuListFixItem normalDanmakuListFixItem) {
        this.f106603b.m112755n4(bLiveDanmakuListItem);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m132487f(BLiveDanmakuListItem bLiveDanmakuListItem, NormalDanmakuListItem normalDanmakuListItem) {
        this.f106603b.m112755n4(bLiveDanmakuListItem);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m132488i(final BLiveDanmakuListItem bLiveDanmakuListItem) {
        NormalDanmakuListItem normalDanmakuListItem = (NormalDanmakuListItem) LayoutInflater.from(this.f106602a.getContext()).inflate(yec0.f198955W, (ViewGroup) null);
        this.f106602a.addView(normalDanmakuListItem);
        BLiveDanmakuListItem bLiveDanmakuListItemM112751j4 = this.f106603b.m112751j4();
        normalDanmakuListItem.m73757c(bLiveDanmakuListItem, bLiveDanmakuListItemM112751j4 != null && bLiveDanmakuListItemM112751j4.equals(bLiveDanmakuListItem), new y20() { // from class: l.fv40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100984a.m132487f(bLiveDanmakuListItem, (NormalDanmakuListItem) obj);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m132489j(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (this.f106602a.getChildCount() > 0) {
            for (int i = 0; i < this.f106602a.getChildCount(); i++) {
                View childAt = this.f106602a.getChildAt(i);
                if (childAt instanceof NormalDanmakuListFixItem) {
                    NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) childAt;
                    if (normalDanmakuListFixItem.f49684d == bLiveDanmakuListItem) {
                        normalDanmakuListFixItem.m73754d(true);
                    } else if (normalDanmakuListFixItem.f49683c) {
                        normalDanmakuListFixItem.m73754d(false);
                    }
                } else if (childAt instanceof NormalDanmakuListItem) {
                    NormalDanmakuListItem normalDanmakuListItem = (NormalDanmakuListItem) childAt;
                    if (normalDanmakuListItem.f49687c == bLiveDanmakuListItem) {
                        normalDanmakuListItem.m73758d(true);
                    } else if (normalDanmakuListItem.f49688d) {
                        normalDanmakuListItem.m73758d(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m132490k(BLiveDanmakuList bLiveDanmakuList, boolean z) {
        this.f106602a.removeAllViews();
        m132491l(bLiveDanmakuList.fixedTypes, z);
        m132492m(bLiveDanmakuList.floatTypes);
    }

    /* JADX INFO: renamed from: l */
    public final void m132491l(List<BLiveDanmakuListItem> list, boolean z) {
        if (jyb.m147479J(list)) {
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItemM112751j4 = this.f106603b.m112751j4();
        if (bLiveDanmakuListItemM112751j4 == null && z) {
            bLiveDanmakuListItemM112751j4 = list.get(0);
        }
        this.f106603b.m112755n4(bLiveDanmakuListItemM112751j4);
        for (int i = 0; i < list.size(); i++) {
            final BLiveDanmakuListItem bLiveDanmakuListItem = list.get(i);
            NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) View.inflate(this.f106602a.getContext(), yec0.f198943V, null);
            this.f106602a.addView(normalDanmakuListFixItem);
            normalDanmakuListFixItem.m73753c(bLiveDanmakuListItem, bLiveDanmakuListItemM112751j4 != null && bLiveDanmakuListItemM112751j4.equals(bLiveDanmakuListItem), new y20() { // from class: l.ev40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f95979a.m132486e(bLiveDanmakuListItem, (NormalDanmakuListFixItem) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m132492m(List<BLiveDanmakuListItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f106602a.addView((NormalDanmakuListDivideItem) LayoutInflater.from(this.f106602a.getContext()).inflate(yec0.f198931U, (ViewGroup) null));
        jyb.m147537z(list, new y20() { // from class: l.dv40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90908a.m132488i((BLiveDanmakuListItem) obj);
            }
        });
        this.f106602a.addView((NormalDanmakuListShadowItem) LayoutInflater.from(this.f106602a.getContext()).inflate(yec0.f198919T, (ViewGroup) null));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
