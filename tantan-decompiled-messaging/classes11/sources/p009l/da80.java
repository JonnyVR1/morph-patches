package p009l;

import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class da80 {

    /* JADX INFO: renamed from: a */
    public CardOperation f11694a;

    /* JADX INFO: renamed from: b */
    public User f11695b;

    /* JADX INFO: renamed from: c */
    public CoreMomentInfo f11696c;

    /* JADX INFO: renamed from: d */
    public BubbleInfo f11697d;

    /* JADX INFO: renamed from: l.da80$a */
    public static /* synthetic */ class C0843a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11698a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f11698a = iArr;
            try {
                iArr[SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11698a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11698a[SwipeDirection.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public da80(User user, CoreMomentInfo coreMomentInfo, BubbleInfo bubbleInfo, CardOperation cardOperation) {
        this.f11695b = user;
        this.f11696c = coreMomentInfo;
        this.f11697d = bubbleInfo;
        this.f11694a = cardOperation;
    }

    /* JADX INFO: renamed from: a */
    public void m13040a(SwipeDirection swipeDirection) {
        int i = C0843a.f11698a[swipeDirection.ordinal()];
        if (i == 1) {
            this.f11694a = CardOperation.SWIPE_LEFT;
        } else if (i == 2) {
            this.f11694a = CardOperation.SWIPE_RIGHT;
        } else {
            if (i != 3) {
                return;
            }
            this.f11694a = CardOperation.SWIPE_UP;
        }
    }
}
