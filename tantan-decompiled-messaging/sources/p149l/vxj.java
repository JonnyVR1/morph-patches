package p149l;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/vxj;", "", "<init>", "()V", "", "b", Constants.INAPP_DATA_TAG, "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "c", "(Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftOuterContentView;", "outerView", "g", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftOuterContentView;)V", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftInnerContentView;", "giftInnerView", "f", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftInnerContentView;)V", "h", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "e", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "a", "Ljava/util/List;", "getGiftItemViewList", "()Ljava/util/List;", "giftItemViewList", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vxj {

    @NotNull
    public static final vxj INSTANCE = new vxj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<LiveGiftItemView> giftItemViewList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static boolean m200562a() {
        List<LiveGiftItemView> list = giftItemViewList;
        if (list.size() >= 58) {
            list.size();
            return false;
        }
        View viewInflate = LayoutInflater.from(ypv.f199497e).inflate(t6c0.f168520t1, (ViewGroup) null, false);
        viewInflate.getClass();
        list.add((LiveGiftItemView) viewInflate);
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m200563b() {
        giftItemViewList.clear();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final LiveGiftItemView m200564c(@NotNull ViewGroup parent) {
        parent.getClass();
        List<LiveGiftItemView> list = giftItemViewList;
        list.size();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(t6c0.f168520t1, parent, false);
        viewInflate.getClass();
        return (LiveGiftItemView) viewInflate;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m200565d() {
        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.txj
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return vxj.m200562a();
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m200566f(@NotNull GiftInnerContentView giftInnerView) {
        giftInnerView.getClass();
        vxj vxjVar = INSTANCE;
        GiftInnerContentView giftInnerContentView = giftInnerView.f50335c;
        giftInnerContentView.getClass();
        vxjVar.m200569e(giftInnerContentView);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m200567g(@NotNull GiftOuterContentView outerView) {
        outerView.getClass();
        VPager vPager = outerView.f50337d;
        int childCount = vPager.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            View childAt = vPager.getChildAt(i);
            GiftInnerContentView giftInnerContentView = childAt instanceof GiftInnerContentView ? (GiftInnerContentView) childAt : null;
            if (giftInnerContentView != null) {
                m200566f(giftInnerContentView);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m200568h() {
        Iterator<T> it = giftItemViewList.iterator();
        while (it.hasNext()) {
            ((LiveGiftItemView) it.next()).m73483e1();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m200569e(RecyclerView recyclerView) {
        ArrayList<LiveGiftItemView> arrayList = new ArrayList();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof LiveGiftItemView) {
                arrayList.add(childAt);
            }
        }
        arrayList.size();
        for (LiveGiftItemView liveGiftItemView : arrayList) {
            ViewParent parent = liveGiftItemView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(liveGiftItemView);
            liveGiftItemView.m73483e1();
            giftItemViewList.add(liveGiftItemView);
        }
    }
}
