package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020 0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m88121d2 = {"Ll/iwr;", "Ll/lb2;", "Ll/lpm0;", "presenter", "<init>", "(Ll/lpm0;)V", "", "getCount", "()I", "Landroid/view/View;", "p0", "", "p1", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", FirebaseAnalytics.Param.INDEX, "", "q", "(I)V", "Landroid/view/ViewGroup;", "container", "position", "r", "(Landroid/view/ViewGroup;I)Landroid/view/View;", OMSTemplateModeType.view, "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "obj", "getItemPosition", "(Ljava/lang/Object;)I", "", "Ll/dpm0;", "list", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;)V", "e", "Ll/lpm0;", "getPresenter", "()Ll/lpm0;", "", "f", "Ljava/util/List;", "dataList", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iwr extends lb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final lpm0<?> presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<dpm0> dataList;

    public iwr(@NotNull lpm0<?> lpm0Var) {
        lpm0Var.getClass();
        this.presenter = lpm0Var;
        this.dataList = new ArrayList();
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.dataList.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NotNull Object obj) {
        obj.getClass();
        if (this.dataList.isEmpty()) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NotNull View p0, @NotNull Object p1) {
        p0.getClass();
        p1.getClass();
        return Intrinsics.m88377d(p0, p1);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(@NotNull ViewGroup container, int position, @NotNull Object view) {
        container.getClass();
        view.getClass();
        container.removeView((View) view);
    }

    /* JADX INFO: renamed from: q */
    public final void m142388q(int index) {
        if (index >= this.dataList.size() || !(this.dataList.get(index).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String() instanceof LiveVoiceAuctionListPage)) {
            return;
        }
        ViewGroup viewGroup = this.dataList.get(index).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        viewGroup.getClass();
        ((LiveVoiceAuctionListPage) viewGroup).m79044j0();
    }

    @Override // p153l.lb2
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public View mo40046p(@NotNull ViewGroup container, int position) {
        container.getClass();
        if (this.dataList.get(position).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String() == null) {
            this.dataList.get(position).m117414h(this.presenter.m155274S3(this.dataList.get(position).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
        }
        ViewGroup viewGroup = this.dataList.get(position).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        viewGroup.getClass();
        if (viewGroup instanceof LiveVoiceAuctionListPage) {
            ((LiveVoiceAuctionListPage) viewGroup).m79047r();
        }
        container.addView(viewGroup);
        return viewGroup;
    }

    /* JADX INFO: renamed from: s */
    public final void m142390s(@NotNull List<dpm0> list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        this.dataList.clear();
        this.dataList.addAll(list);
        notifyDataSetChanged();
    }
}
