package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.p058ui.settings.intlGender.IntlAddGenderDetailsAct;
import com.p051p1.mobile.putong.data.IntlGenderItem;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.SubGender;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0004\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u001bJ'\u0010\"\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\"\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0006R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m88121d2 = {"Ll/b3n;", "Ll/iam;", "Ll/x2n;", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;)V", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "data", "Lcom/p1/mobile/putong/data/SubGender;", Option.TYPE, "", "m", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/x2n;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "r", BLiveStormDanmakuGiftResourceType.f45292l, "a", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;", "setAct", "Lv/VLinear;", "b", "Lv/VLinear;", "get_root", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "k", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "j", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "e", "Ll/x2n;", "Ll/ymo;", "f", "Ll/ymo;", "_adapter", "g", "Lcom/p1/mobile/putong/data/SubGender;", "_currentSubGender", "", "h", "Z", "_isChanged", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b3n implements iam<x2n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public IntlAddGenderDetailsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public x2n presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ymo _adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public SubGender _currentSubGender;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: l.b3n$a */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/b3n$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15914a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.set(0, 0, 0, qa00.f156323j);
        }
    }

    /* JADX INFO: renamed from: l.b3n$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/b3n$b", "Ll/ymo$a;", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15915b implements ymo.InterfaceC21631a {
        public C15915b() {
        }

        @Override // p153l.ymo.InterfaceC21631a
        /* JADX INFO: renamed from: a */
        public void mo102356a(SubGender optionId) {
            b3n b3nVar = b3n.this;
            if (optionId != null) {
                b3nVar._currentSubGender = optionId;
                b3n.this._isChanged = true;
            } else {
                b3nVar._currentSubGender = null;
                b3n.this._isChanged = false;
            }
        }
    }

    public b3n(@NotNull IntlAddGenderDetailsAct intlAddGenderDetailsAct) {
        intlAddGenderDetailsAct.getClass();
        this.act = intlAddGenderDetailsAct;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m102344a(SubGender subGender, IntlGenderItem intlGenderItem) {
        return Boolean.valueOf(Intrinsics.m88377d(intlGenderItem.f39609id, subGender));
    }

    /* JADX INFO: renamed from: b */
    public static void m102345b(b3n b3nVar, View view) {
        x2n x2nVar = b3nVar.presenter;
        if (x2nVar == null) {
            Intrinsics.m88391r("presenter");
            x2nVar = null;
        }
        x2nVar.m209160i0(b3nVar._currentSubGender);
        b3nVar.act.m45660g2();
    }

    /* JADX INFO: renamed from: c */
    public static void m102346c(b3n b3nVar, int i) {
        b3nVar.m102352j().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: m */
    private final void m102349m(List<? extends IntlGenderItem> data, SubGender option) {
        m102354l(data, option);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @Override // p153l.iam
    @NotNull
    public Act act() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m102350d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM107805b = c3n.m107805b(this, inflater, parent);
        viewM107805b.getClass();
        return viewM107805b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull x2n presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m102350d(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VPullUpRecyclerView m102352j() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VNavigationBar m102353k() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m102354l(List<? extends IntlGenderItem> data, final SubGender option) {
        this._currentSubGender = option;
        this._adapter = new ymo(this.act);
        VPullUpRecyclerView vPullUpRecyclerViewM102352j = m102352j();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(1);
        vPullUpRecyclerViewM102352j.setLayoutManager(linearLayoutManager);
        ymo ymoVar = this._adapter;
        ymo ymoVar2 = null;
        if (ymoVar == null) {
            Intrinsics.m88391r("_adapter");
            ymoVar = null;
        }
        vPullUpRecyclerViewM102352j.setAdapter(ymoVar);
        vPullUpRecyclerViewM102352j.addItemDecoration(new C15914a());
        ymo ymoVar3 = this._adapter;
        if (ymoVar3 == null) {
            Intrinsics.m88391r("_adapter");
            ymoVar3 = null;
        }
        ymoVar3.m216730L(data, option);
        ymo ymoVar4 = this._adapter;
        if (ymoVar4 == null) {
            Intrinsics.m88391r("_adapter");
        } else {
            ymoVar2 = ymoVar4;
        }
        ymoVar2.m216731M(new C15915b());
        final int iM147476G = jyb.m147476G(data, new qcj() { // from class: l.z2n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b3n.m102344a(option, (IntlGenderItem) obj);
            }
        });
        if (iM147476G > 0) {
            l51.m152887G(new Runnable() { // from class: l.a3n
                @Override // java.lang.Runnable
                public final void run() {
                    b3n.m102346c(this.f68298a, iM147476G);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m102355r() {
        m102353k().setTitle(R$string.f18942Vf);
        m102353k().setLeftIconOnClick(new View.OnClickListener() { // from class: l.y2n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b3n.m102345b(this.f197269a, view);
            }
        });
        x2n x2nVar = this.presenter;
        x2n x2nVar2 = null;
        if (x2nVar == null) {
            Intrinsics.m88391r("presenter");
            x2nVar = null;
        }
        List<IntlGenderItem> listM209158g0 = x2nVar.m209158g0();
        x2n x2nVar3 = this.presenter;
        if (x2nVar3 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            x2nVar2 = x2nVar3;
        }
        m102349m(listM209158g0, x2nVar2.m209159h0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
