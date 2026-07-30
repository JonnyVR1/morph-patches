package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatItemView;
import java.util.ArrayList;
import java.util.List;
import p147v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class hqs extends dac0<BLiveVoiceRoomFeed> {

    /* JADX INFO: renamed from: d */
    public View f109096d;

    /* JADX INFO: renamed from: f */
    public Act f109098f;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceRoomFeed> f109095c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final l80<BLiveVoiceRoomFeed> f109097e = new C17374a();

    /* JADX INFO: renamed from: l.hqs$a */
    public class C17374a extends l80<BLiveVoiceRoomFeed> {

        /* JADX INFO: renamed from: l.hqs$a$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C17374a.this.m148842o();
                }
            }
        }

        public C17374a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            VPager vPager = (VPager) hqs.this.m132507G(VPager.class, viewGroup);
            if (vPager == null) {
                return;
            }
            vPager.m4185d(new a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i, View view) {
            zvf0.m220368A("e_start_audio_room_entrance", "p_circle_detail", j760.m140076a("circle_detail_tab", "group"), j760.m140076a("groupchat_id", ""), j760.m140076a("group_name", ""), j760.m140076a("audio_id", bLiveVoiceRoomFeed.roomId));
        }
    }

    public hqs(Act act, View view) {
        this.f109098f = act;
        this.f109096d = view;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f109095c.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return i == 2 ? this.f109096d : LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162786q, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i, int i2) {
        if (i == 1) {
            this.f109097e.m148839h(view, bLiveVoiceRoomFeed, i2 - 1);
            LiveGroupChatItemView liveGroupChatItemView = (LiveGroupChatItemView) view;
            liveGroupChatItemView.m71168o0(bLiveVoiceRoomFeed);
            xdl0.m208329E0(liveGroupChatItemView, new View.OnClickListener() { // from class: l.gqs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f103976a.m132509I(bLiveVoiceRoomFeed, view2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final <T extends View> T m132507G(Class<T> cls, View view) {
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
                    t = (T) m132507G(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoomFeed getItem(int i) {
        if (i == 0 || this.f109095c.size() == 0) {
            return null;
        }
        return this.f109095c.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m132509I(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, View view) {
        if (bLiveVoiceRoomFeed.isCreateRoomType()) {
            m132510J(bLiveVoiceRoomFeed);
        } else {
            ehn0.m116503f(this.f109098f, bLiveVoiceRoomFeed, "swipe-page", "simplechat".equals(bLiveVoiceRoomFeed.extraInfo.sourceName));
        }
        zvf0.m220399u("e_start_audio_room_entrance", "p_circle_detail", j760.m140076a("circle_detail_tab", "group"), j760.m140076a("groupchat_id", ""), j760.m140076a("group_name", ""), j760.m140076a("audio_id", bLiveVoiceRoomFeed.roomId));
    }

    /* JADX INFO: renamed from: J */
    public void m132510J(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        ehn0.m116502e(this.f109098f, AnchorStartData.getBuilder().m67563n("feedCreateLive").m67569t(amo0.m97564a(bLiveVoiceRoomFeed.extraInfo.sourceName, bLiveVoiceRoomFeed.index)).m67568s(bLiveVoiceRoomFeed.roomTopicId).m67560k());
        amo0.m97565b(bLiveVoiceRoomFeed.index, bLiveVoiceRoomFeed.extraInfo.sourceName);
        if ("recommend".equals(bLiveVoiceRoomFeed.extraInfo.sourceName)) {
            m132512L("createVoiceRoomCard.click");
        }
    }

    /* JADX INFO: renamed from: K */
    public void m132511K(List<BLiveVoiceRoomFeed> list) {
        this.f109095c.clear();
        this.f109095c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m132512L(String str) {
        hfw.m130790a("[live][square]", "reportCreateVoiceCard:" + str);
        LiveVoiceApi.reportCreateVoiceInfo(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f109097e.m148842o();
        if (getItemViewType(abstractC0566d0.getLayoutPosition()) == 2 && (layoutParams = abstractC0566d0.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.C0593c)) {
            ((StaggeredGridLayoutManager.C0593c) layoutParams).m3576i(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f109097e.m148842o();
    }
}
