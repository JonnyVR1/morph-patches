package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108¨\u0006:"}, m88121d2 = {"Ll/wgn;", "Ll/iam;", "Ll/lgn;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/lgn;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;", "pageData", "n", "(Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;)V", "ctx", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/content/Context;)V", "Lv/navigationbar/VNavigationBar;", "a", "Lv/navigationbar/VNavigationBar;", RXScreenCaptureService.KEY_INDEX, "()Lv/navigationbar/VNavigationBar;", "set_page_title_bar", "(Lv/navigationbar/VNavigationBar;)V", "_page_title_bar", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", "j", "()Lv/VRecyclerView;", "set_question_list", "(Lv/VRecyclerView;)V", "_question_list", "Lv/VText;", "c", "Lv/VText;", "k", "()Lv/VText;", "set_vipService", "(Lv/VText;)V", "_vipService", Constants.INAPP_DATA_TAG, "Ll/lgn;", "mPresenter", "Ll/jfn;", "Ll/jfn;", "adapter", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wgn implements iam<lgn> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VNavigationBar _page_title_bar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _question_list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _vipService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public lgn mPresenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final jfn adapter = new jfn();

    /* JADX INFO: renamed from: a */
    public static void m206201a(IntlFeedbackPageData intlFeedbackPageData, wgn wgnVar, View view) {
        if (TextUtils.isEmpty(intlFeedbackPageData.getConversationId())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = wgnVar.getContext().getString(R$string.f45765o);
            string.getClass();
            o1j0.m165651y(String.format(string, Arrays.copyOf(new Object[]{String.valueOf(intlFeedbackPageData.getGradeLimit())}, 1)));
            return;
        }
        lgn lgnVar = wgnVar.mPresenter;
        if (lgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            lgnVar = null;
        }
        String conversationId = intlFeedbackPageData.getConversationId();
        conversationId.getClass();
        lgnVar.m154095k0(conversationId);
    }

    /* JADX INFO: renamed from: b */
    public static void m206202b(wgn wgnVar, View view) {
        lgn lgnVar = wgnVar.mPresenter;
        if (lgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            lgnVar = null;
        }
        lgnVar.m154093i0();
    }

    /* JADX INFO: renamed from: c */
    public static Unit m206203c(wgn wgnVar, boolean z) {
        if (z) {
            wgnVar.m206209j().scrollToPosition(wgnVar.adapter.m68538J().size() - 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m206205m(wgn wgnVar, View view) {
        lgn lgnVar = wgnVar.mPresenter;
        if (lgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            lgnVar = null;
        }
        lgnVar.m154094j0();
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        lgn lgnVar = this.mPresenter;
        if (lgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            lgnVar = null;
        }
        return lgnVar.getAct();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m206206e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM210927b = xgn.m210927b(this, inflater, parent);
        viewM210927b.getClass();
        return viewM210927b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull lgn presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VNavigationBar m206208i() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_page_title_bar");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM206206e = m206206e(inflater, parent);
        Context context = viewM206206e.getContext();
        context.getClass();
        m206211l(context);
        return viewM206206e;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VRecyclerView m206209j() {
        VRecyclerView vRecyclerView = this._question_list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_question_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m206210k() {
        VText vText = this._vipService;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vipService");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m206211l(Context ctx) {
        m206208i().setLeftIconDrawable(tu0.m192702b(ctx, nbc0.f141094D));
        m206208i().setLeftIconOnClick(new View.OnClickListener() { // from class: l.sgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wgn.m206202b(this.f167905a, view);
            }
        });
        m206208i().setTitle(R$string.f45763n);
        VImage vImage = new VImage(ctx);
        vImage.setImageResource(nbc0.f141100F);
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.tgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wgn.m206205m(this.f174105a, view);
            }
        });
        m206208i().setRightIconViews(vImage);
        m206209j().setLayoutManager(new LinearLayoutManager(ctx, 1, false));
        m206209j().setAdapter(this.adapter);
    }

    /* JADX INFO: renamed from: n */
    public final void m206212n(@NotNull final IntlFeedbackPageData pageData) {
        pageData.getClass();
        jfn jfnVar = this.adapter;
        List<IntlFeedbackPageData.GroupsDTO> groups = pageData.getGroups();
        groups.getClass();
        jfnVar.m144693g0(groups, new Function1() { // from class: l.ugn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wgn.m206203c(this.f178918a, ((Boolean) obj).booleanValue());
            }
        });
        bnl0.m105509E0(m206210k(), new View.OnClickListener() { // from class: l.vgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wgn.m206201a(pageData, this, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
