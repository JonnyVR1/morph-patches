package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatItemView;
import java.util.ArrayList;
import java.util.List;
import p151v.VPager;

/* JADX INFO: loaded from: classes9.dex */
public class iss extends jic0<BLiveVoiceRoomFeed> {

    /* JADX INFO: renamed from: d */
    public View f116696d;

    /* JADX INFO: renamed from: f */
    public Act f116698f;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceRoomFeed> f116695c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final h80<BLiveVoiceRoomFeed> f116697e = new C17793a();

    /* JADX INFO: renamed from: l.iss$a */
    public class C17793a extends h80<BLiveVoiceRoomFeed> {

        /* JADX INFO: renamed from: l.iss$a$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C17793a.this.m133884o();
                }
            }
        }

        public C17793a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            VPager vPager = (VPager) iss.this.m141892G(VPager.class, viewGroup);
            if (vPager == null) {
                return;
            }
            vPager.m4187d(new a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i, View view) {
            i4g0.m138492A("e_start_audio_room_entrance", "p_circle_detail", pf60.m172085a("circle_detail_tab", "group"), pf60.m172085a("groupchat_id", ""), pf60.m172085a("group_name", ""), pf60.m172085a("audio_id", bLiveVoiceRoomFeed.roomId));
        }
    }

    public iss(Act act, View view) {
        this.f116698f = act;
        this.f116696d = view;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f116695c.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return i == 2 ? this.f116696d : LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193900q, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i, int i2) {
        if (i == 1) {
            this.f116697e.m133881h(view, bLiveVoiceRoomFeed, i2 - 1);
            LiveGroupChatItemView liveGroupChatItemView = (LiveGroupChatItemView) view;
            liveGroupChatItemView.m72351o0(bLiveVoiceRoomFeed);
            bnl0.m105509E0(liveGroupChatItemView, new View.OnClickListener() { // from class: l.hss
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f111472a.m141894I(bLiveVoiceRoomFeed, view2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final <T extends View> T m141892G(Class<T> cls, View view) {
        if (cls.isInstance(view)) {
            return view;
        }
        T t = null;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    t = (T) childAt;
                } else if (childAt instanceof ViewGroup) {
                    t = (T) m141892G(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoomFeed getItem(int i) {
        if (i == 0 || this.f116695c.size() == 0) {
            return null;
        }
        return this.f116695c.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m141894I(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, View view) {
        if (bLiveVoiceRoomFeed.isCreateRoomType()) {
            m141895J(bLiveVoiceRoomFeed);
        } else {
            iqn0.m141678f(this.f116698f, bLiveVoiceRoomFeed, "swipe-page", "simplechat".equals(bLiveVoiceRoomFeed.extraInfo.sourceName));
        }
        i4g0.m138523u("e_start_audio_room_entrance", "p_circle_detail", pf60.m172085a("circle_detail_tab", "group"), pf60.m172085a("groupchat_id", ""), pf60.m172085a("group_name", ""), pf60.m172085a("audio_id", bLiveVoiceRoomFeed.roomId));
    }

    /* JADX INFO: renamed from: J */
    public void m141895J(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        iqn0.m141677e(this.f116698f, AnchorStartData.getBuilder().m68746n("feedCreateLive").m68752t(evo0.m122803a(bLiveVoiceRoomFeed.extraInfo.sourceName, bLiveVoiceRoomFeed.index)).m68751s(bLiveVoiceRoomFeed.roomTopicId).m68743k());
        evo0.m122804b(bLiveVoiceRoomFeed.index, bLiveVoiceRoomFeed.extraInfo.sourceName);
        if ("recommend".equals(bLiveVoiceRoomFeed.extraInfo.sourceName)) {
            m141897L("createVoiceRoomCard.click");
        }
    }

    /* JADX INFO: renamed from: K */
    public void m141896K(List<BLiveVoiceRoomFeed> list) {
        this.f116695c.clear();
        this.f116695c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m141897L(String str) {
        fhw.m125605a("[live][square]", "reportCreateVoiceCard:" + str);
        LiveVoiceApi.reportCreateVoiceInfo(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f116697e.m133884o();
        if (getItemViewType(abstractC0569e0.getLayoutPosition()) == 2 && (layoutParams = abstractC0569e0.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.C0595c)) {
            ((StaggeredGridLayoutManager.C0595c) layoutParams).m3577i(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f116697e.m133884o();
    }
}
