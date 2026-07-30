package p153l;

import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class ji80 {

    /* JADX INFO: renamed from: a */
    public CardOperation f121049a;

    /* JADX INFO: renamed from: b */
    public User f121050b;

    /* JADX INFO: renamed from: c */
    public CoreMomentInfo f121051c;

    /* JADX INFO: renamed from: d */
    public BubbleInfo f121052d;

    /* JADX INFO: renamed from: l.ji80$a */
    public static /* synthetic */ class C17955a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f121053a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f121053a = iArr;
            try {
                iArr[SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f121053a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f121053a[SwipeDirection.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ji80(User user, CoreMomentInfo coreMomentInfo, BubbleInfo bubbleInfo, CardOperation cardOperation) {
        this.f121050b = user;
        this.f121051c = coreMomentInfo;
        this.f121052d = bubbleInfo;
        this.f121049a = cardOperation;
    }

    /* JADX INFO: renamed from: a */
    public void m144973a(SwipeDirection swipeDirection) {
        int i = C17955a.f121053a[swipeDirection.ordinal()];
        if (i == 1) {
            this.f121049a = CardOperation.SWIPE_LEFT;
        } else if (i == 2) {
            this.f121049a = CardOperation.SWIPE_RIGHT;
        } else {
            if (i != 3) {
                return;
            }
            this.f121049a = CardOperation.SWIPE_UP;
        }
    }
}
