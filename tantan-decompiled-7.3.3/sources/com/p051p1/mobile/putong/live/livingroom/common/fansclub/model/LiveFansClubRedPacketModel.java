package com.p051p1.mobile.putong.live.livingroom.common.fansclub.model;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.d3q;
import p153l.fo0;
import p153l.ner;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketModel extends d3q<LiveFansClubRedPacketView> {

    /* JADX INFO: renamed from: a */
    public BLiveFanBaseRedPacketInfo f49845a;

    /* JADX INFO: renamed from: b */
    public ner f49846b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f49847c;

    /* JADX INFO: renamed from: d */
    public RedPacketState f49848d;

    public enum RedPacketState {
        AVAILABLE,
        GRABBING,
        GET,
        NOT_GET,
        EXPIRE,
        NOT_ENOUGH
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.model.LiveFansClubRedPacketModel$a */
    public static /* synthetic */ class C12917a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49849a;

        static {
            int[] iArr = new int[RedPacketState.values().length];
            f49849a = iArr;
            try {
                iArr[RedPacketState.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49849a[RedPacketState.GRABBING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49849a[RedPacketState.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49849a[RedPacketState.NOT_GET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49849a[RedPacketState.EXPIRE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49849a[RedPacketState.NOT_ENOUGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public LiveFansClubRedPacketModel(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, ner nerVar) {
        this.f49845a = bLiveFanBaseRedPacketInfo;
        this.f49846b = nerVar;
    }

    /* JADX INFO: renamed from: H */
    public final RedPacketState m74022H() {
        RedPacketState redPacketState = this.f49848d;
        if (redPacketState != null) {
            return redPacketState;
        }
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = this.f49845a;
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

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFansClubRedPacketView liveFansClubRedPacketView) {
        super.mo71749u(liveFansClubRedPacketView);
        int i = C12917a.f49849a[m74022H().ordinal()];
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (i) {
            case 1:
                liveFansClubRedPacketView.m74182s0(this.f49845a, this.f49846b.duringCreated(C22421c.interval(1L, timeUnit).onBackpressureLatest().observeOn(fo0.m126432a())), this.f49847c);
                break;
            case 2:
                liveFansClubRedPacketView.m74186w0(this.f49845a, this.f49846b.duringCreated(C22421c.interval(1L, timeUnit).onBackpressureLatest().observeOn(fo0.m126432a())));
                break;
            case 3:
                liveFansClubRedPacketView.m74185v0(this.f49845a);
                break;
            case 4:
                liveFansClubRedPacketView.m74181r0(this.f49845a);
                break;
            case 5:
                liveFansClubRedPacketView.m74184u0(this.f49845a);
                break;
            case 6:
                liveFansClubRedPacketView.m74187y0(this.f49845a);
                break;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m74024J(View.OnClickListener onClickListener) {
        this.f49847c = onClickListener;
    }

    /* JADX INFO: renamed from: K */
    public void m74025K(RedPacketState redPacketState) {
        this.f49848d = redPacketState;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198908S0;
    }
}
