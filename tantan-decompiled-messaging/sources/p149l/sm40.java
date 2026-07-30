package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListDivideItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListFixItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListShadowItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class sm40 implements s7m<om40<pn40>> {

    /* JADX INFO: renamed from: a */
    public final NormalDanmakuImgViewGroup f165324a;

    /* JADX INFO: renamed from: b */
    public om40<pn40> f165325b;

    public sm40(NormalDanmakuImgViewGroup normalDanmakuImgViewGroup) {
        this.f165324a = normalDanmakuImgViewGroup;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165325b.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(om40<pn40> om40Var) {
        this.f165325b = om40Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m184934e(BLiveDanmakuListItem bLiveDanmakuListItem, NormalDanmakuListFixItem normalDanmakuListFixItem) {
        this.f165325b.m165004n4(bLiveDanmakuListItem);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m184935f(BLiveDanmakuListItem bLiveDanmakuListItem, NormalDanmakuListItem normalDanmakuListItem) {
        this.f165325b.m165004n4(bLiveDanmakuListItem);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m184936i(final BLiveDanmakuListItem bLiveDanmakuListItem) {
        NormalDanmakuListItem normalDanmakuListItem = (NormalDanmakuListItem) LayoutInflater.from(this.f165324a.getContext()).inflate(t6c0.f168223W, (ViewGroup) null);
        this.f165324a.addView(normalDanmakuListItem);
        BLiveDanmakuListItem bLiveDanmakuListItemM165000j4 = this.f165325b.m165000j4();
        normalDanmakuListItem.m72574c(bLiveDanmakuListItem, bLiveDanmakuListItemM165000j4 != null && bLiveDanmakuListItemM165000j4.equals(bLiveDanmakuListItem), new e30() { // from class: l.rm40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160061a.m184935f(bLiveDanmakuListItem, (NormalDanmakuListItem) obj);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m184937j(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (this.f165324a.getChildCount() > 0) {
            for (int i = 0; i < this.f165324a.getChildCount(); i++) {
                View childAt = this.f165324a.getChildAt(i);
                if (childAt instanceof NormalDanmakuListFixItem) {
                    NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) childAt;
                    if (normalDanmakuListFixItem.f48836d == bLiveDanmakuListItem) {
                        normalDanmakuListFixItem.m72571d(true);
                    } else if (normalDanmakuListFixItem.f48835c) {
                        normalDanmakuListFixItem.m72571d(false);
                    }
                } else if (childAt instanceof NormalDanmakuListItem) {
                    NormalDanmakuListItem normalDanmakuListItem = (NormalDanmakuListItem) childAt;
                    if (normalDanmakuListItem.f48839c == bLiveDanmakuListItem) {
                        normalDanmakuListItem.m72575d(true);
                    } else if (normalDanmakuListItem.f48840d) {
                        normalDanmakuListItem.m72575d(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m184938k(BLiveDanmakuList bLiveDanmakuList, boolean z) {
        this.f165324a.removeAllViews();
        m184939l(bLiveDanmakuList.fixedTypes, z);
        m184940m(bLiveDanmakuList.floatTypes);
    }

    /* JADX INFO: renamed from: l */
    public final void m184939l(List<BLiveDanmakuListItem> list, boolean z) {
        if (vwb.m200296J(list)) {
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItemM165000j4 = this.f165325b.m165000j4();
        if (bLiveDanmakuListItemM165000j4 == null && z) {
            bLiveDanmakuListItemM165000j4 = list.get(0);
        }
        this.f165325b.m165004n4(bLiveDanmakuListItemM165000j4);
        for (int i = 0; i < list.size(); i++) {
            final BLiveDanmakuListItem bLiveDanmakuListItem = list.get(i);
            NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) View.inflate(this.f165324a.getContext(), t6c0.f168211V, null);
            this.f165324a.addView(normalDanmakuListFixItem);
            normalDanmakuListFixItem.m72570c(bLiveDanmakuListItem, bLiveDanmakuListItemM165000j4 != null && bLiveDanmakuListItemM165000j4.equals(bLiveDanmakuListItem), new e30() { // from class: l.qm40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155279a.m184934e(bLiveDanmakuListItem, (NormalDanmakuListFixItem) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m184940m(List<BLiveDanmakuListItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f165324a.addView((NormalDanmakuListDivideItem) LayoutInflater.from(this.f165324a.getContext()).inflate(t6c0.f168199U, (ViewGroup) null));
        vwb.m200354z(list, new e30() { // from class: l.pm40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150191a.m184936i((BLiveDanmakuListItem) obj);
            }
        });
        this.f165324a.addView((NormalDanmakuListShadowItem) LayoutInflater.from(this.f165324a.getContext()).inflate(t6c0.f168187T, (ViewGroup) null));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
