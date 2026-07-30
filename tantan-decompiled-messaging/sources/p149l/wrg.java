package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class wrg extends asg {
    public wrg(Act act, xrg xrgVar, FeedCenterImageView feedCenterImageView) {
        super(act, xrgVar, feedCenterImageView);
    }

    @Override // p149l.asg
    /* JADX INFO: renamed from: c */
    public void mo98593c(int i, final Moment moment, final HashMap<String, Boolean> map) {
        FeedCenterImageView feedCenterImageView = this.f71441s;
        int i2 = FeedCenterImageView.f41817F;
        int i3 = feedCenterImageView.f41818B;
        boolean z = false;
        m98592b(this.f71431i, false);
        m98592b(this.f71434l, false);
        m98592b(this.f71433k, false);
        m98592b(this.f71430h, !TextUtils.isEmpty(moment.value));
        m98592b(this.f71426d, false);
        Boolean bool = map.get(moment.f56011id);
        VExpandableTextContainer vExpandableTextContainer = this.f71430h;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        vExpandableTextContainer.m79200L(z).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.urg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z2) {
                this.f177829a.m205190k(map, moment, z2);
            }
        }).m79201M(moment.value);
        m98592b(this.f71432j, true);
        Picture pictureM205185f = m205185f(moment);
        if (pictureM205185f != null) {
            m205187h();
            m205191l(moment);
            TextUtils.equals(this.f71446x, "from_discover_dating");
            m205193n();
            m205192m(moment, i2, i3, pictureM205185f);
            csg.m108510f(moment, this.f71438p);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Picture m205185f(Moment moment) {
        Cloneable cloneable = moment.live.snapshot;
        if (cloneable == null) {
            cloneable = (NullChecker.m81303a(moment.liveRoom) && NullChecker.m81303a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
        }
        if (cloneable instanceof Picture) {
            return (Picture) cloneable;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m205186g(Moment moment) {
        return (vwb.m200296J(moment.live.specialLabels) || TextUtils.isEmpty(moment.live.specialLabels.get(0).value)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m205187h() {
        for (int i = 0; i < this.f71432j.getChildCount(); i++) {
            if (this.f71432j.getChildAt(i) instanceof VRelative) {
                VRelative vRelative = (VRelative) this.f71432j.getChildAt(i);
                m98592b(vRelative, false);
                View childAt = vRelative.getChildAt(0);
                if (childAt instanceof VDraweeView) {
                    VDraweeView vDraweeView = (VDraweeView) childAt;
                    qib0.f154691G.m184725o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey(null);
                }
                m98592b(vRelative.getChildAt(1), false);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m205188i(Moment moment) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        return liveMultiCallInfo != null && liveMultiCallInfo.onGoing;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m205189j(Moment moment, View view) {
        csg.m108506b(this.f71440r, this.f71446x, moment, this.f71448z, this.f71447y, this.f71422A);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m205190k(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        this.f71441s.m64641O(z);
    }

    /* JADX INFO: renamed from: l */
    public final void m205191l(Moment moment) {
        VText vText = this.f71436n;
        if (m205186g(moment)) {
            vText.setText(moment.live.specialLabels.get(0).value);
        } else if (moment.isLiveDataChange()) {
            vText.setText(m205188i(moment) ? R$string.f39049e3 : R$string.f39035c3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m205192m(final Moment moment, int i, int i2, Picture picture) {
        VRelative vRelative = (VRelative) this.f71432j.getChildAt(0);
        if (vRelative.getChildCount() < 2) {
            return;
        }
        View childAt = vRelative.getChildAt(0);
        xdl0.m208344M(vRelative.getChildAt(1), false);
        if (childAt instanceof VDraweeView) {
            VDraweeView vDraweeView = (VDraweeView) childAt;
            xdl0.m208345M0(vRelative, true);
            Dimension dimensionM98591a = m98591a(picture);
            vRelative.setLayoutParams(new FrameLayout.LayoutParams(dimensionM98591a.width, dimensionM98591a.height));
            vDraweeView.getHierarchy().m112053H(RoundingParams.m8249c(vqg.m199581y()).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.vrg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182719a.m205189j(moment, view);
                }
            });
            if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
                return;
            }
            qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(t100.m186890d(i) + (i2 * 2)));
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m205193n() {
        m98592b(this.f71434l, true);
        this.f71437o.loadAnimWithListener("feed_live_room_icon.svga", -1, null, true);
    }
}
