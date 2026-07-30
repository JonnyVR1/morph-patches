package p149l;

import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class da80 {

    /* JADX INFO: renamed from: a */
    public CardOperation f85197a;

    /* JADX INFO: renamed from: b */
    public User f85198b;

    /* JADX INFO: renamed from: c */
    public CoreMomentInfo f85199c;

    /* JADX INFO: renamed from: d */
    public BubbleInfo f85200d;

    /* JADX INFO: renamed from: l.da80$a */
    public static /* synthetic */ class C16322a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f85201a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f85201a = iArr;
            try {
                iArr[SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85201a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85201a[SwipeDirection.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public da80(User user, CoreMomentInfo coreMomentInfo, BubbleInfo bubbleInfo, CardOperation cardOperation) {
        this.f85198b = user;
        this.f85199c = coreMomentInfo;
        this.f85200d = bubbleInfo;
        this.f85197a = cardOperation;
    }

    /* JADX INFO: renamed from: a */
    public void m110579a(SwipeDirection swipeDirection) {
        int i = C16322a.f85201a[swipeDirection.ordinal()];
        if (i == 1) {
            this.f85197a = CardOperation.SWIPE_LEFT;
        } else if (i == 2) {
            this.f85197a = CardOperation.SWIPE_RIGHT;
        } else {
            if (i != 3) {
                return;
            }
            this.f85197a = CardOperation.SWIPE_UP;
        }
    }
}
