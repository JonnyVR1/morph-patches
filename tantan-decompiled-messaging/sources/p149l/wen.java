package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108¨\u0006:"}, m87232d2 = {"Ll/wen;", "Ll/s7m;", "Ll/len;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/len;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;", "pageData", "n", "(Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;)V", "ctx", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/Context;)V", "Lv/navigationbar/VNavigationBar;", "a", "Lv/navigationbar/VNavigationBar;", RXScreenCaptureService.KEY_INDEX, "()Lv/navigationbar/VNavigationBar;", "set_page_title_bar", "(Lv/navigationbar/VNavigationBar;)V", "_page_title_bar", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", "j", "()Lv/VRecyclerView;", "set_question_list", "(Lv/VRecyclerView;)V", "_question_list", "Lv/VText;", "c", "Lv/VText;", "k", "()Lv/VText;", "set_vipService", "(Lv/VText;)V", "_vipService", Constants.INAPP_DATA_TAG, "Ll/len;", "mPresenter", "Ll/jdn;", "Ll/jdn;", "adapter", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wen implements s7m<len> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VNavigationBar _page_title_bar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _question_list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _vipService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public len mPresenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final jdn adapter = new jdn();

    /* JADX INFO: renamed from: a */
    public static void m202909a(IntlFeedbackPageData intlFeedbackPageData, wen wenVar, View view) {
        if (TextUtils.isEmpty(intlFeedbackPageData.getConversationId())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = wenVar.getContext().getString(R$string.f44917o);
            string.getClass();
            lsi0.m151595y(String.format(string, Arrays.copyOf(new Object[]{String.valueOf(intlFeedbackPageData.getGradeLimit())}, 1)));
            return;
        }
        len lenVar = wenVar.mPresenter;
        if (lenVar == null) {
            Intrinsics.m87502r("mPresenter");
            lenVar = null;
        }
        String conversationId = intlFeedbackPageData.getConversationId();
        conversationId.getClass();
        lenVar.m149591k0(conversationId);
    }

    /* JADX INFO: renamed from: b */
    public static void m202910b(wen wenVar, View view) {
        len lenVar = wenVar.mPresenter;
        if (lenVar == null) {
            Intrinsics.m87502r("mPresenter");
            lenVar = null;
        }
        lenVar.m149589i0();
    }

    /* JADX INFO: renamed from: c */
    public static Unit m202911c(wen wenVar, boolean z) {
        if (z) {
            wenVar.m202917j().scrollToPosition(wenVar.adapter.m67355J().size() - 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m202913m(wen wenVar, View view) {
        len lenVar = wenVar.mPresenter;
        if (lenVar == null) {
            Intrinsics.m87502r("mPresenter");
            lenVar = null;
        }
        lenVar.m149590j0();
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        len lenVar = this.mPresenter;
        if (lenVar == null) {
            Intrinsics.m87502r("mPresenter");
            lenVar = null;
        }
        return lenVar.getAct();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m202914e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM208585b = xen.m208585b(this, inflater, parent);
        viewM208585b.getClass();
        return viewM208585b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull len presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VNavigationBar m202916i() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_page_title_bar");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM202914e = m202914e(inflater, parent);
        Context context = viewM202914e.getContext();
        context.getClass();
        m202919l(context);
        return viewM202914e;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VRecyclerView m202917j() {
        VRecyclerView vRecyclerView = this._question_list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_question_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m202918k() {
        VText vText = this._vipService;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vipService");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m202919l(Context ctx) {
        m202916i().setLeftIconDrawable(nu0.m161424b(ctx, h3c0.f105603D));
        m202916i().setLeftIconOnClick(new View.OnClickListener() { // from class: l.sen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wen.m202910b(this.f164023a, view);
            }
        });
        m202916i().setTitle(R$string.f44915n);
        VImage vImage = new VImage(ctx);
        vImage.setImageResource(h3c0.f105609F);
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.ten
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wen.m202913m(this.f169860a, view);
            }
        });
        m202916i().setRightIconViews(vImage);
        m202917j().setLayoutManager(new LinearLayoutManager(ctx, 1, false));
        m202917j().setAdapter(this.adapter);
    }

    /* JADX INFO: renamed from: n */
    public final void m202920n(@NotNull final IntlFeedbackPageData pageData) {
        pageData.getClass();
        jdn jdnVar = this.adapter;
        List<IntlFeedbackPageData.GroupsDTO> groups = pageData.getGroups();
        groups.getClass();
        jdnVar.m141051g0(groups, new Function1() { // from class: l.uen
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wen.m202911c(this.f176053a, ((Boolean) obj).booleanValue());
            }
        });
        xdl0.m208329E0(m202918k(), new View.OnClickListener() { // from class: l.ven
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wen.m202909a(pageData, this, view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
