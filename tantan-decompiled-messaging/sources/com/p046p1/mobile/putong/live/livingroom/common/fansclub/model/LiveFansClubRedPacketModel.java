package com.p046p1.mobile.putong.live.livingroom.common.fansclub.model;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.d1q;
import p149l.jo0;
import p149l.mcr;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketModel extends d1q<LiveFansClubRedPacketView> {

    /* JADX INFO: renamed from: a */
    public BLiveFanBaseRedPacketInfo f48997a;

    /* JADX INFO: renamed from: b */
    public mcr f48998b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f48999c;

    /* JADX INFO: renamed from: d */
    public RedPacketState f49000d;

    public enum RedPacketState {
        AVAILABLE,
        GRABBING,
        GET,
        NOT_GET,
        EXPIRE,
        NOT_ENOUGH
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.model.LiveFansClubRedPacketModel$a */
    public static /* synthetic */ class C12754a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49001a;

        static {
            int[] iArr = new int[RedPacketState.values().length];
            f49001a = iArr;
            try {
                iArr[RedPacketState.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49001a[RedPacketState.GRABBING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49001a[RedPacketState.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49001a[RedPacketState.NOT_GET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49001a[RedPacketState.EXPIRE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49001a[RedPacketState.NOT_ENOUGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public LiveFansClubRedPacketModel(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, mcr mcrVar) {
        this.f48997a = bLiveFanBaseRedPacketInfo;
        this.f48998b = mcrVar;
    }

    /* JADX INFO: renamed from: H */
    public final RedPacketState m72839H() {
        RedPacketState redPacketState = this.f49000d;
        if (redPacketState != null) {
            return redPacketState;
        }
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = this.f48997a;
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

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFansClubRedPacketView liveFansClubRedPacketView) {
        super.mo70566u(liveFansClubRedPacketView);
        int i = C12754a.f49001a[m72839H().ordinal()];
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (i) {
            case 1:
                liveFansClubRedPacketView.m72999s0(this.f48997a, this.f48998b.duringCreated(C22306c.interval(1L, timeUnit).onBackpressureLatest().observeOn(jo0.m142408a())), this.f48999c);
                break;
            case 2:
                liveFansClubRedPacketView.m73003w0(this.f48997a, this.f48998b.duringCreated(C22306c.interval(1L, timeUnit).onBackpressureLatest().observeOn(jo0.m142408a())));
                break;
            case 3:
                liveFansClubRedPacketView.m73002v0(this.f48997a);
                break;
            case 4:
                liveFansClubRedPacketView.m72998r0(this.f48997a);
                break;
            case 5:
                liveFansClubRedPacketView.m73001u0(this.f48997a);
                break;
            case 6:
                liveFansClubRedPacketView.m73004y0(this.f48997a);
                break;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m72841J(View.OnClickListener onClickListener) {
        this.f48999c = onClickListener;
    }

    /* JADX INFO: renamed from: K */
    public void m72842K(RedPacketState redPacketState) {
        this.f49000d = redPacketState;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168176S0;
    }
}
