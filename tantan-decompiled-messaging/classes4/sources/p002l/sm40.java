package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListDivideItem;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListFixItem;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListItem;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListShadowItem;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import java.util.List;
import l.e30;
import l.s7m;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sm40 implements s7m<om40<pn40>> {

    /* JADX INFO: renamed from: a */
    public final NormalDanmakuImgViewGroup f19121a;

    /* JADX INFO: renamed from: b */
    public om40<pn40> f19122b;

    public sm40(NormalDanmakuImgViewGroup normalDanmakuImgViewGroup) {
        this.f19121a = normalDanmakuImgViewGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22565C0() {
        return this.f19122b.act();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m22570i1(om40<pn40> om40Var) {
        this.f19122b = om40Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m22567e(BLiveDanmakuListItem bLiveDanmakuListItem, NormalDanmakuListFixItem normalDanmakuListFixItem) {
        this.f19122b.m19620n4(bLiveDanmakuListItem);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m22568f(BLiveDanmakuListItem bLiveDanmakuListItem, NormalDanmakuListItem normalDanmakuListItem) {
        this.f19122b.m19620n4(bLiveDanmakuListItem);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m22569i(final BLiveDanmakuListItem bLiveDanmakuListItem) {
        NormalDanmakuListItem normalDanmakuListItem = (NormalDanmakuListItem) LayoutInflater.from(this.f19121a.getContext()).inflate(t6c0.f19719W, (ViewGroup) null);
        this.f19121a.addView(normalDanmakuListItem);
        BLiveDanmakuListItem bLiveDanmakuListItemM19616j4 = this.f19122b.m19616j4();
        normalDanmakuListItem.m6070c(bLiveDanmakuListItem, bLiveDanmakuListItemM19616j4 != null && bLiveDanmakuListItemM19616j4.equals(bLiveDanmakuListItem), new e30() { // from class: l.rm40
            public final void call(Object obj) {
                this.f18605a.m22568f(bLiveDanmakuListItem, (NormalDanmakuListItem) obj);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public void m22571j(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (this.f19121a.getChildCount() > 0) {
            for (int i = 0; i < this.f19121a.getChildCount(); i++) {
                View childAt = this.f19121a.getChildAt(i);
                if (childAt instanceof NormalDanmakuListFixItem) {
                    NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) childAt;
                    if (normalDanmakuListFixItem.f4878d == bLiveDanmakuListItem) {
                        normalDanmakuListFixItem.m6067d(true);
                    } else if (normalDanmakuListFixItem.f4877c) {
                        normalDanmakuListFixItem.m6067d(false);
                    }
                } else if (childAt instanceof NormalDanmakuListItem) {
                    NormalDanmakuListItem normalDanmakuListItem = (NormalDanmakuListItem) childAt;
                    if (normalDanmakuListItem.f4881c == bLiveDanmakuListItem) {
                        normalDanmakuListItem.m6071d(true);
                    } else if (normalDanmakuListItem.f4882d) {
                        normalDanmakuListItem.m6071d(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m22572k(BLiveDanmakuList bLiveDanmakuList, boolean z) {
        this.f19121a.removeAllViews();
        m22573l(bLiveDanmakuList.fixedTypes, z);
        m22574m(bLiveDanmakuList.floatTypes);
    }

    /* JADX INFO: renamed from: l */
    public final void m22573l(List<BLiveDanmakuListItem> list, boolean z) {
        if (vwb.J(list)) {
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItemM19616j4 = this.f19122b.m19616j4();
        if (bLiveDanmakuListItemM19616j4 == null && z) {
            bLiveDanmakuListItemM19616j4 = list.get(0);
        }
        this.f19122b.m19620n4(bLiveDanmakuListItemM19616j4);
        for (int i = 0; i < list.size(); i++) {
            final BLiveDanmakuListItem bLiveDanmakuListItem = list.get(i);
            NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) View.inflate(this.f19121a.getContext(), t6c0.f19707V, null);
            this.f19121a.addView(normalDanmakuListFixItem);
            normalDanmakuListFixItem.m6066c(bLiveDanmakuListItem, bLiveDanmakuListItemM19616j4 != null && bLiveDanmakuListItemM19616j4.equals(bLiveDanmakuListItem), new e30() { // from class: l.qm40
                public final void call(Object obj) {
                    this.f18089a.m22567e(bLiveDanmakuListItem, (NormalDanmakuListFixItem) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m22574m(List<BLiveDanmakuListItem> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f19121a.addView((NormalDanmakuListDivideItem) LayoutInflater.from(this.f19121a.getContext()).inflate(t6c0.f19695U, (ViewGroup) null));
        vwb.z(list, new e30() { // from class: l.pm40
            public final void call(Object obj) {
                this.f17536a.m22569i((BLiveDanmakuListItem) obj);
            }
        });
        this.f19121a.addView((NormalDanmakuListShadowItem) LayoutInflater.from(this.f19121a.getContext()).inflate(t6c0.f19683T, (ViewGroup) null));
    }

    public void destroy() {
    }
}
