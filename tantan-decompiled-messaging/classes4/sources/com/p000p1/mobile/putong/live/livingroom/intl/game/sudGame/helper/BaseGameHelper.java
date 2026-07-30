package com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGCache;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGDecorator;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSTAPPDecorator;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.MGStateResponse;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.SudJsonUtils;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import l.e51;
import l.h5j0;
import l.osi0;
import tech.sud.gip.core.ISudFSMStateHandle;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.SudInitSDKParamModel;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class BaseGameHelper implements SudFSMMGListener {

    /* JADX INFO: renamed from: j */
    public static long f7017j;

    /* JADX INFO: renamed from: a */
    public Act f7018a;

    /* JADX INFO: renamed from: b */
    public String f7019b;

    /* JADX INFO: renamed from: e */
    public boolean f7022e;

    /* JADX INFO: renamed from: f */
    public View f7023f;

    /* JADX INFO: renamed from: c */
    public final SudFSTAPPDecorator f7020c = new SudFSTAPPDecorator();

    /* JADX INFO: renamed from: d */
    public final SudFSMMGDecorator f7021d = new SudFSMMGDecorator();

    /* JADX INFO: renamed from: g */
    public GameConfigModel f7024g = new GameConfigModel();

    /* JADX INFO: renamed from: h */
    public int f7025h = 0;

    /* JADX INFO: renamed from: i */
    public final Runnable f7026i = new Runnable() { // from class: l.tl2
        @Override // java.lang.Runnable
        public final void run() {
            this.f20295a.m8884r();
        }
    };

    public enum ErrorEnum {
        GET_CODE_ERROR,
        INIT_SDK_ERROR,
        LOAD_MG_ERROR
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$a */
    public class C0459a implements InterfaceC0463e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f7027a;

        public C0459a(long j) {
            this.f7027a = j;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC0463e
        /* JADX INFO: renamed from: a */
        public void mo8893a() {
            BaseGameHelper.this.m8873g(ErrorEnum.GET_CODE_ERROR);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC0463e
        public void onSuccess(String str) {
            if (BaseGameHelper.this.f7022e) {
                long j = this.f7027a;
                if (j != BaseGameHelper.f7017j) {
                    return;
                }
                BaseGameHelper baseGameHelper = BaseGameHelper.this;
                baseGameHelper.m8882p(baseGameHelper.f7018a, j, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$b */
    public class C0460b implements ISudListenerInitSDK {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f7029a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f7030b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f7031c;

        public C0460b(Act act, String str, long j) {
            this.f7029a = act;
            this.f7030b = str;
            this.f7031c = j;
        }

        public void onFailure(int i, String str) {
            if (BaseGameHelper.this.mo8883q()) {
                osi0.g("initSDK onFailure:" + str + "(" + i + ")");
            }
            BaseGameHelper.this.m8873g(ErrorEnum.INIT_SDK_ERROR);
        }

        public void onSuccess() {
            BaseGameHelper.this.m8885s(this.f7029a, this.f7030b, this.f7031c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$c */
    public class C0461c implements InterfaceC0463e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SudFSTAPPDecorator f7033a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ISudFSMStateHandle f7034b;

        public C0461c(SudFSTAPPDecorator sudFSTAPPDecorator, ISudFSMStateHandle iSudFSMStateHandle) {
            this.f7033a = sudFSTAPPDecorator;
            this.f7034b = iSudFSMStateHandle;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC0463e
        /* JADX INFO: renamed from: a */
        public void mo8893a() {
            MGStateResponse mGStateResponse = new MGStateResponse();
            mGStateResponse.ret_code = -1;
            this.f7034b.failure(SudJsonUtils.toJson(mGStateResponse));
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC0463e
        public void onSuccess(String str) {
            if (BaseGameHelper.this.f7022e) {
                MGStateResponse mGStateResponse = new MGStateResponse();
                mGStateResponse.ret_code = 0;
                this.f7033a.updateCode(str, null);
                this.f7034b.success(SudJsonUtils.toJson(mGStateResponse));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC0462d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f7036a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ISudFSMStateHandle f7037b;

        public ViewTreeObserverOnGlobalLayoutListenerC0462d(View view, ISudFSMStateHandle iSudFSMStateHandle) {
            this.f7036a = view;
            this.f7037b = iSudFSMStateHandle;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f7036a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BaseGameHelper.this.m8887u(this.f7037b, this.f7036a.getMeasuredWidth(), this.f7036a.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$e */
    public interface InterfaceC0463e {
        /* JADX INFO: renamed from: a */
        void mo8893a();

        void onSuccess(String str);
    }

    public BaseGameHelper(Act act) {
        this.f7018a = act;
    }

    /* JADX INFO: renamed from: A */
    public void m8869A(SudFSTAPPDecorator sudFSTAPPDecorator, ISudFSMStateHandle iSudFSMStateHandle) {
        mo8877k(mo8881o(), mo8875i(), new C0461c(sudFSTAPPDecorator, iSudFSMStateHandle));
    }

    /* JADX INFO: renamed from: B */
    public void m8870B(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        iSudFSMStateHandle.success(SudJsonUtils.toJson(this.f7024g));
    }

    /* JADX INFO: renamed from: C */
    public void m8871C(View view, ISudFSMStateHandle iSudFSMStateHandle) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0462d(view, iSudFSMStateHandle));
        } else {
            m8887u(iSudFSMStateHandle, measuredWidth, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m8872D(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            if (mo8883q()) {
                osi0.g("gameRoomId can not be empty");
            }
        } else {
            if (f7017j == j && str.equals(this.f7019b)) {
                return;
            }
            h5j0.INSTANCE.d("sud_game_loading");
            this.f7022e = true;
            m8874h();
            this.f7019b = str;
            f7017j = j;
            m8886t(j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8873g(ErrorEnum errorEnum) {
        errorEnum.name();
        int i = this.f7025h + 1;
        this.f7025h = i;
        if (i <= 2) {
            if (e51.o(this.f7026i)) {
                return;
            }
            e51.H(this.f7018a, this.f7026i, 2000L);
            return;
        }
        if (errorEnum == ErrorEnum.INIT_SDK_ERROR || errorEnum == ErrorEnum.LOAD_MG_ERROR) {
            CrashHelper.e(new IllegalStateException("intl live sud game error" + errorEnum.name() + "  gameId:" + f7017j), "国际化三方游戏sdk初始化错误", CrashHelper.ReportLevel.p9);
        }
        m8889w();
    }

    /* JADX INFO: renamed from: h */
    public final void m8874h() {
        e51.J(this.f7026i);
        if (f7017j > 0) {
            this.f7020c.destroyMG();
            this.f7021d.destroyMG();
            f7017j = 0L;
            this.f7023f = null;
            this.f7019b = null;
            mo8891y();
        }
        this.f7025h = 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo8875i();

    /* JADX INFO: renamed from: j */
    public abstract String mo8876j();

    /* JADX INFO: renamed from: k */
    public abstract void mo8877k(String str, String str2, InterfaceC0463e interfaceC0463e);

    /* JADX INFO: renamed from: l */
    public abstract void mo8878l(GameViewInfoModel gameViewInfoModel);

    /* JADX INFO: renamed from: m */
    public abstract String mo8879m();

    /* JADX INFO: renamed from: n */
    public SudFSMMGCache m8880n() {
        return this.f7021d.getSudFSMMGCache();
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo8881o();

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m8869A(this.f7020c, iSudFSMStateHandle);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameDestroyed() {
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameStarted() {
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m8870B(iSudFSMStateHandle, str);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m8871C(this.f7023f, iSudFSMStateHandle);
    }

    /* JADX INFO: renamed from: p */
    public final void m8882p(Act act, long j, String str) {
        String strMo8875i = mo8875i();
        String strMo8876j = mo8876j();
        SudInitSDKParamModel sudInitSDKParamModel = new SudInitSDKParamModel();
        sudInitSDKParamModel.context = act;
        sudInitSDKParamModel.appId = strMo8875i;
        sudInitSDKParamModel.appKey = strMo8876j;
        sudInitSDKParamModel.isTestEnv = mo8883q();
        sudInitSDKParamModel.userId = mo8881o();
        SudMGP.initSDK(sudInitSDKParamModel, new C0460b(act, str, j));
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo8883q();

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8884r() {
        m8886t(f7017j);
    }

    /* JADX INFO: renamed from: s */
    public final void m8885s(Act act, String str, long j) {
        if (!act.isDestroyed() && this.f7022e && j == f7017j) {
            this.f7021d.setSudFSMMGListener(this);
            ISudFSTAPP iSudFSTAPPLoadMG = SudMGP.loadMG(act, mo8881o(), this.f7019b, str, j, mo8879m(), this.f7021d);
            if (iSudFSTAPPLoadMG == null) {
                if (mo8883q()) {
                    osi0.g("loadMG params error");
                }
                m8873g(ErrorEnum.LOAD_MG_ERROR);
            } else {
                this.f7020c.setISudFSTAPP(iSudFSTAPPLoadMG);
                View gameView = iSudFSTAPPLoadMG.getGameView();
                this.f7023f = gameView;
                mo8888v(gameView);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8886t(long j) {
        if (this.f7018a.isDestroyed() || j <= 0) {
            return;
        }
        mo8877k(mo8881o(), mo8875i(), new C0459a(j));
    }

    /* JADX INFO: renamed from: u */
    public final void m8887u(ISudFSMStateHandle iSudFSMStateHandle, int i, int i2) {
        GameViewInfoModel gameViewInfoModel = new GameViewInfoModel();
        gameViewInfoModel.ret_code = 0;
        GameViewInfoModel.GameViewSizeModel gameViewSizeModel = gameViewInfoModel.view_size;
        gameViewSizeModel.width = i;
        gameViewSizeModel.height = i2;
        mo8878l(gameViewInfoModel);
        iSudFSMStateHandle.success(SudJsonUtils.toJson(gameViewInfoModel));
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo8888v(View view);

    /* JADX INFO: renamed from: w */
    public void m8889w() {
        this.f7022e = false;
        m8874h();
    }

    /* JADX INFO: renamed from: x */
    public void m8890x() {
        this.f7020c.pauseMG();
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo8891y();

    /* JADX INFO: renamed from: z */
    public void m8892z() {
        this.f7020c.playMG();
    }
}
