package com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGCache;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGDecorator;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSTAPPDecorator;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.MGStateResponse;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.SudJsonUtils;
import com.tantanapp.common.utils.CrashHelper;
import p153l.l51;
import p153l.lej0;
import p153l.r1j0;
import tech.sud.gip.core.ISudFSMStateHandle;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.SudInitSDKParamModel;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseGameHelper implements SudFSMMGListener {

    /* JADX INFO: renamed from: j */
    public static long f51823j;

    /* JADX INFO: renamed from: a */
    public Act f51824a;

    /* JADX INFO: renamed from: b */
    public String f51825b;

    /* JADX INFO: renamed from: e */
    public boolean f51828e;

    /* JADX INFO: renamed from: f */
    public View f51829f;

    /* JADX INFO: renamed from: c */
    public final SudFSTAPPDecorator f51826c = new SudFSTAPPDecorator();

    /* JADX INFO: renamed from: d */
    public final SudFSMMGDecorator f51827d = new SudFSMMGDecorator();

    /* JADX INFO: renamed from: g */
    public GameConfigModel f51830g = new GameConfigModel();

    /* JADX INFO: renamed from: h */
    public int f51831h = 0;

    /* JADX INFO: renamed from: i */
    public final Runnable f51832i = new Runnable() { // from class: l.bm2
        @Override // java.lang.Runnable
        public final void run() {
            this.f77234a.m76448r();
        }
    };

    public enum ErrorEnum {
        GET_CODE_ERROR,
        INIT_SDK_ERROR,
        LOAD_MG_ERROR
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$a */
    public class C13033a implements InterfaceC13037e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f51833a;

        public C13033a(long j) {
            this.f51833a = j;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC13037e
        /* JADX INFO: renamed from: a */
        public void mo76457a() {
            BaseGameHelper.this.m76437g(ErrorEnum.GET_CODE_ERROR);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC13037e
        public void onSuccess(String str) {
            if (BaseGameHelper.this.f51828e) {
                long j = this.f51833a;
                if (j != BaseGameHelper.f51823j) {
                    return;
                }
                BaseGameHelper baseGameHelper = BaseGameHelper.this;
                baseGameHelper.m76446p(baseGameHelper.f51824a, j, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$b */
    public class C13034b implements ISudListenerInitSDK {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f51835a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f51836b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f51837c;

        public C13034b(Act act, String str, long j) {
            this.f51835a = act;
            this.f51836b = str;
            this.f51837c = j;
        }

        @Override // tech.sud.gip.core.ISudListenerInitSDK
        public void onFailure(int i, String str) {
            if (BaseGameHelper.this.mo76447q()) {
                r1j0.m179420g("initSDK onFailure:" + str + "(" + i + ")");
            }
            BaseGameHelper.this.m76437g(ErrorEnum.INIT_SDK_ERROR);
        }

        @Override // tech.sud.gip.core.ISudListenerInitSDK
        public void onSuccess() {
            BaseGameHelper.this.m76449s(this.f51835a, this.f51836b, this.f51837c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$c */
    public class C13035c implements InterfaceC13037e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SudFSTAPPDecorator f51839a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ISudFSMStateHandle f51840b;

        public C13035c(SudFSTAPPDecorator sudFSTAPPDecorator, ISudFSMStateHandle iSudFSMStateHandle) {
            this.f51839a = sudFSTAPPDecorator;
            this.f51840b = iSudFSMStateHandle;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC13037e
        /* JADX INFO: renamed from: a */
        public void mo76457a() {
            MGStateResponse mGStateResponse = new MGStateResponse();
            mGStateResponse.ret_code = -1;
            this.f51840b.failure(SudJsonUtils.toJson(mGStateResponse));
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC13037e
        public void onSuccess(String str) {
            if (BaseGameHelper.this.f51828e) {
                MGStateResponse mGStateResponse = new MGStateResponse();
                mGStateResponse.ret_code = 0;
                this.f51839a.updateCode(str, null);
                this.f51840b.success(SudJsonUtils.toJson(mGStateResponse));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC13036d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f51842a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ISudFSMStateHandle f51843b;

        public ViewTreeObserverOnGlobalLayoutListenerC13036d(View view, ISudFSMStateHandle iSudFSMStateHandle) {
            this.f51842a = view;
            this.f51843b = iSudFSMStateHandle;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f51842a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BaseGameHelper.this.m76451u(this.f51843b, this.f51842a.getMeasuredWidth(), this.f51842a.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$e */
    public interface InterfaceC13037e {
        /* JADX INFO: renamed from: a */
        void mo76457a();

        void onSuccess(String str);
    }

    public BaseGameHelper(Act act) {
        this.f51824a = act;
    }

    /* JADX INFO: renamed from: A */
    public void m76433A(SudFSTAPPDecorator sudFSTAPPDecorator, ISudFSMStateHandle iSudFSMStateHandle) {
        mo76441k(mo76445o(), mo76439i(), new C13035c(sudFSTAPPDecorator, iSudFSMStateHandle));
    }

    /* JADX INFO: renamed from: B */
    public void m76434B(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        iSudFSMStateHandle.success(SudJsonUtils.toJson(this.f51830g));
    }

    /* JADX INFO: renamed from: C */
    public void m76435C(View view, ISudFSMStateHandle iSudFSMStateHandle) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13036d(view, iSudFSMStateHandle));
        } else {
            m76451u(iSudFSMStateHandle, measuredWidth, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m76436D(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            if (mo76447q()) {
                r1j0.m179420g("gameRoomId can not be empty");
            }
        } else {
            if (f51823j == j && str.equals(this.f51825b)) {
                return;
            }
            lej0.INSTANCE.m153910d("sud_game_loading");
            this.f51828e = true;
            m76438h();
            this.f51825b = str;
            f51823j = j;
            m76450t(j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76437g(ErrorEnum errorEnum) {
        errorEnum.name();
        int i = this.f51831h + 1;
        this.f51831h = i;
        if (i <= 2) {
            if (l51.m152909o(this.f51832i)) {
                return;
            }
            l51.m152888H(this.f51824a, this.f51832i, 2000L);
            return;
        }
        if (errorEnum == ErrorEnum.INIT_SDK_ERROR || errorEnum == ErrorEnum.LOAD_MG_ERROR) {
            CrashHelper.m82481e(new IllegalStateException("intl live sud game error" + errorEnum.name() + "  gameId:" + f51823j), "国际化三方游戏sdk初始化错误", CrashHelper.ReportLevel.p9);
        }
        m76453w();
    }

    /* JADX INFO: renamed from: h */
    public final void m76438h() {
        l51.m152890J(this.f51832i);
        if (f51823j > 0) {
            this.f51826c.destroyMG();
            this.f51827d.destroyMG();
            f51823j = 0L;
            this.f51829f = null;
            this.f51825b = null;
            mo76455y();
        }
        this.f51831h = 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo76439i();

    /* JADX INFO: renamed from: j */
    public abstract String mo76440j();

    /* JADX INFO: renamed from: k */
    public abstract void mo76441k(String str, String str2, InterfaceC13037e interfaceC13037e);

    /* JADX INFO: renamed from: l */
    public abstract void mo76442l(GameViewInfoModel gameViewInfoModel);

    /* JADX INFO: renamed from: m */
    public abstract String mo76443m();

    /* JADX INFO: renamed from: n */
    public SudFSMMGCache m76444n() {
        return this.f51827d.getSudFSMMGCache();
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo76445o();

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m76433A(this.f51826c, iSudFSMStateHandle);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameDestroyed() {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameStarted() {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m76434B(iSudFSMStateHandle, str);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m76435C(this.f51829f, iSudFSMStateHandle);
    }

    /* JADX INFO: renamed from: p */
    public final void m76446p(Act act, long j, String str) {
        String strMo76439i = mo76439i();
        String strMo76440j = mo76440j();
        SudInitSDKParamModel sudInitSDKParamModel = new SudInitSDKParamModel();
        sudInitSDKParamModel.context = act;
        sudInitSDKParamModel.appId = strMo76439i;
        sudInitSDKParamModel.appKey = strMo76440j;
        sudInitSDKParamModel.isTestEnv = mo76447q();
        sudInitSDKParamModel.userId = mo76445o();
        SudMGP.initSDK(sudInitSDKParamModel, new C13034b(act, str, j));
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo76447q();

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m76448r() {
        m76450t(f51823j);
    }

    /* JADX INFO: renamed from: s */
    public final void m76449s(Act act, String str, long j) {
        if (!act.isDestroyed() && this.f51828e && j == f51823j) {
            this.f51827d.setSudFSMMGListener(this);
            ISudFSTAPP iSudFSTAPPLoadMG = SudMGP.loadMG(act, mo76445o(), this.f51825b, str, j, mo76443m(), this.f51827d);
            if (iSudFSTAPPLoadMG == null) {
                if (mo76447q()) {
                    r1j0.m179420g("loadMG params error");
                }
                m76437g(ErrorEnum.LOAD_MG_ERROR);
            } else {
                this.f51826c.setISudFSTAPP(iSudFSTAPPLoadMG);
                View gameView = iSudFSTAPPLoadMG.getGameView();
                this.f51829f = gameView;
                mo76452v(gameView);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m76450t(long j) {
        if (this.f51824a.isDestroyed() || j <= 0) {
            return;
        }
        mo76441k(mo76445o(), mo76439i(), new C13033a(j));
    }

    /* JADX INFO: renamed from: u */
    public final void m76451u(ISudFSMStateHandle iSudFSMStateHandle, int i, int i2) {
        GameViewInfoModel gameViewInfoModel = new GameViewInfoModel();
        gameViewInfoModel.ret_code = 0;
        GameViewInfoModel.GameViewSizeModel gameViewSizeModel = gameViewInfoModel.view_size;
        gameViewSizeModel.width = i;
        gameViewSizeModel.height = i2;
        mo76442l(gameViewInfoModel);
        iSudFSMStateHandle.success(SudJsonUtils.toJson(gameViewInfoModel));
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo76452v(View view);

    /* JADX INFO: renamed from: w */
    public void m76453w() {
        this.f51828e = false;
        m76438h();
    }

    /* JADX INFO: renamed from: x */
    public void m76454x() {
        this.f51826c.pauseMG();
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo76455y();

    /* JADX INFO: renamed from: z */
    public void m76456z() {
        this.f51826c.playMG();
    }
}
