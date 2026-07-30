package com.p000p1.mobile.putong.live.livingroom.common.fansclub.model;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketView;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import java.util.concurrent.TimeUnit;
import l.d1q;
import l.jo0;
import l.mcr;
import p002l.t6c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubRedPacketModel extends d1q<LiveFansClubRedPacketView> {

    /* JADX INFO: renamed from: a */
    public BLiveFanBaseRedPacketInfo f5039a;

    /* JADX INFO: renamed from: b */
    public mcr f5040b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f5041c;

    /* JADX INFO: renamed from: d */
    public RedPacketState f5042d;

    public enum RedPacketState {
        AVAILABLE,
        GRABBING,
        GET,
        NOT_GET,
        EXPIRE,
        NOT_ENOUGH
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.model.LiveFansClubRedPacketModel$a */
    public static /* synthetic */ class C0343a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5043a;

        static {
            int[] iArr = new int[RedPacketState.values().length];
            f5043a = iArr;
            try {
                iArr[RedPacketState.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5043a[RedPacketState.GRABBING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5043a[RedPacketState.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5043a[RedPacketState.NOT_GET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5043a[RedPacketState.EXPIRE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5043a[RedPacketState.NOT_ENOUGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public LiveFansClubRedPacketModel(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, mcr mcrVar) {
        this.f5039a = bLiveFanBaseRedPacketInfo;
        this.f5040b = mcrVar;
    }

    /* JADX INFO: renamed from: H */
    public final RedPacketState m6356H() {
        RedPacketState redPacketState = this.f5042d;
        if (redPacketState != null) {
            return redPacketState;
        }
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = this.f5039a;
        if (bLiveFanBaseRedPacketInfo.hit) {
            return RedPacketState.GET;
        }
        if (bLiveFanBaseRedPacketInfo.hasGrabbed) {
            return RedPacketState.NOT_GET;
        }
        if (bLiveFanBaseRedPacketInfo.isValid) {
            return !bLiveFanBaseRedPacketInfo.isEnough ? RedPacketState.NOT_ENOUGH : RedPacketState.AVAILABLE;
        }
        return RedPacketState.EXPIRE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m6361u(LiveFansClubRedPacketView liveFansClubRedPacketView) {
        super.u(liveFansClubRedPacketView);
        int i = C0343a.f5043a[m6356H().ordinal()];
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (i) {
            case 1:
                liveFansClubRedPacketView.m6522s0(this.f5039a, this.f5040b.duringCreated(c.interval(1L, timeUnit).onBackpressureLatest().observeOn(jo0.a())), this.f5041c);
                break;
            case 2:
                liveFansClubRedPacketView.m6526w0(this.f5039a, this.f5040b.duringCreated(c.interval(1L, timeUnit).onBackpressureLatest().observeOn(jo0.a())));
                break;
            case 3:
                liveFansClubRedPacketView.m6525v0(this.f5039a);
                break;
            case 4:
                liveFansClubRedPacketView.m6521r0(this.f5039a);
                break;
            case 5:
                liveFansClubRedPacketView.m6524u0(this.f5039a);
                break;
            case 6:
                liveFansClubRedPacketView.m6527y0(this.f5039a);
                break;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m6358J(View.OnClickListener onClickListener) {
        this.f5041c = onClickListener;
    }

    /* JADX INFO: renamed from: K */
    public void m6359K(RedPacketState redPacketState) {
        this.f5042d = redPacketState;
    }

    /* JADX INFO: renamed from: o */
    public int m6360o() {
        return t6c0.f19672S0;
    }
}
