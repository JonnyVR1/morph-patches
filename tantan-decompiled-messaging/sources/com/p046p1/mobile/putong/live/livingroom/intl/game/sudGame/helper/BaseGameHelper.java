package com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGCache;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGDecorator;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSTAPPDecorator;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.MGStateResponse;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.SudJsonUtils;
import com.tantanapp.common.utils.CrashHelper;
import p149l.e51;
import p149l.h5j0;
import p149l.osi0;
import tech.sud.gip.core.ISudFSMStateHandle;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.SudInitSDKParamModel;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseGameHelper implements SudFSMMGListener {

    /* JADX INFO: renamed from: j */
    public static long f50975j;

    /* JADX INFO: renamed from: a */
    public Act f50976a;

    /* JADX INFO: renamed from: b */
    public String f50977b;

    /* JADX INFO: renamed from: e */
    public boolean f50980e;

    /* JADX INFO: renamed from: f */
    public View f50981f;

    /* JADX INFO: renamed from: c */
    public final SudFSTAPPDecorator f50978c = new SudFSTAPPDecorator();

    /* JADX INFO: renamed from: d */
    public final SudFSMMGDecorator f50979d = new SudFSMMGDecorator();

    /* JADX INFO: renamed from: g */
    public GameConfigModel f50982g = new GameConfigModel();

    /* JADX INFO: renamed from: h */
    public int f50983h = 0;

    /* JADX INFO: renamed from: i */
    public final Runnable f50984i = new Runnable() { // from class: l.tl2
        @Override // java.lang.Runnable
        public final void run() {
            this.f170990a.m75265r();
        }
    };

    public enum ErrorEnum {
        GET_CODE_ERROR,
        INIT_SDK_ERROR,
        LOAD_MG_ERROR
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$a */
    public class C12870a implements InterfaceC12874e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f50985a;

        public C12870a(long j) {
            this.f50985a = j;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC12874e
        /* JADX INFO: renamed from: a */
        public void mo75274a() {
            BaseGameHelper.this.m75254g(ErrorEnum.GET_CODE_ERROR);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC12874e
        public void onSuccess(String str) {
            if (BaseGameHelper.this.f50980e) {
                long j = this.f50985a;
                if (j != BaseGameHelper.f50975j) {
                    return;
                }
                BaseGameHelper baseGameHelper = BaseGameHelper.this;
                baseGameHelper.m75263p(baseGameHelper.f50976a, j, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$b */
    public class C12871b implements ISudListenerInitSDK {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f50987a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f50988b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f50989c;

        public C12871b(Act act, String str, long j) {
            this.f50987a = act;
            this.f50988b = str;
            this.f50989c = j;
        }

        @Override // tech.sud.gip.core.ISudListenerInitSDK
        public void onFailure(int i, String str) {
            if (BaseGameHelper.this.mo75264q()) {
                osi0.m165783g("initSDK onFailure:" + str + "(" + i + ")");
            }
            BaseGameHelper.this.m75254g(ErrorEnum.INIT_SDK_ERROR);
        }

        @Override // tech.sud.gip.core.ISudListenerInitSDK
        public void onSuccess() {
            BaseGameHelper.this.m75266s(this.f50987a, this.f50988b, this.f50989c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$c */
    public class C12872c implements InterfaceC12874e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SudFSTAPPDecorator f50991a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ISudFSMStateHandle f50992b;

        public C12872c(SudFSTAPPDecorator sudFSTAPPDecorator, ISudFSMStateHandle iSudFSMStateHandle) {
            this.f50991a = sudFSTAPPDecorator;
            this.f50992b = iSudFSMStateHandle;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC12874e
        /* JADX INFO: renamed from: a */
        public void mo75274a() {
            MGStateResponse mGStateResponse = new MGStateResponse();
            mGStateResponse.ret_code = -1;
            this.f50992b.failure(SudJsonUtils.toJson(mGStateResponse));
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper.InterfaceC12874e
        public void onSuccess(String str) {
            if (BaseGameHelper.this.f50980e) {
                MGStateResponse mGStateResponse = new MGStateResponse();
                mGStateResponse.ret_code = 0;
                this.f50991a.updateCode(str, null);
                this.f50992b.success(SudJsonUtils.toJson(mGStateResponse));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC12873d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f50994a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ISudFSMStateHandle f50995b;

        public ViewTreeObserverOnGlobalLayoutListenerC12873d(View view, ISudFSMStateHandle iSudFSMStateHandle) {
            this.f50994a = view;
            this.f50995b = iSudFSMStateHandle;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f50994a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BaseGameHelper.this.m75268u(this.f50995b, this.f50994a.getMeasuredWidth(), this.f50994a.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper$e */
    public interface InterfaceC12874e {
        /* JADX INFO: renamed from: a */
        void mo75274a();

        void onSuccess(String str);
    }

    public BaseGameHelper(Act act) {
        this.f50976a = act;
    }

    /* JADX INFO: renamed from: A */
    public void m75250A(SudFSTAPPDecorator sudFSTAPPDecorator, ISudFSMStateHandle iSudFSMStateHandle) {
        mo75258k(mo75262o(), mo75256i(), new C12872c(sudFSTAPPDecorator, iSudFSMStateHandle));
    }

    /* JADX INFO: renamed from: B */
    public void m75251B(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        iSudFSMStateHandle.success(SudJsonUtils.toJson(this.f50982g));
    }

    /* JADX INFO: renamed from: C */
    public void m75252C(View view, ISudFSMStateHandle iSudFSMStateHandle) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC12873d(view, iSudFSMStateHandle));
        } else {
            m75268u(iSudFSMStateHandle, measuredWidth, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m75253D(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            if (mo75264q()) {
                osi0.m165783g("gameRoomId can not be empty");
            }
        } else {
            if (f50975j == j && str.equals(this.f50977b)) {
                return;
            }
            h5j0.INSTANCE.m129405d("sud_game_loading");
            this.f50980e = true;
            m75255h();
            this.f50977b = str;
            f50975j = j;
            m75267t(j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m75254g(ErrorEnum errorEnum) {
        errorEnum.name();
        int i = this.f50983h + 1;
        this.f50983h = i;
        if (i <= 2) {
            if (e51.m114764o(this.f50984i)) {
                return;
            }
            e51.m114743H(this.f50976a, this.f50984i, 2000L);
            return;
        }
        if (errorEnum == ErrorEnum.INIT_SDK_ERROR || errorEnum == ErrorEnum.LOAD_MG_ERROR) {
            CrashHelper.m81298e(new IllegalStateException("intl live sud game error" + errorEnum.name() + "  gameId:" + f50975j), "国际化三方游戏sdk初始化错误", CrashHelper.ReportLevel.p9);
        }
        m75270w();
    }

    /* JADX INFO: renamed from: h */
    public final void m75255h() {
        e51.m114745J(this.f50984i);
        if (f50975j > 0) {
            this.f50978c.destroyMG();
            this.f50979d.destroyMG();
            f50975j = 0L;
            this.f50981f = null;
            this.f50977b = null;
            mo75272y();
        }
        this.f50983h = 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo75256i();

    /* JADX INFO: renamed from: j */
    public abstract String mo75257j();

    /* JADX INFO: renamed from: k */
    public abstract void mo75258k(String str, String str2, InterfaceC12874e interfaceC12874e);

    /* JADX INFO: renamed from: l */
    public abstract void mo75259l(GameViewInfoModel gameViewInfoModel);

    /* JADX INFO: renamed from: m */
    public abstract String mo75260m();

    /* JADX INFO: renamed from: n */
    public SudFSMMGCache m75261n() {
        return this.f50979d.getSudFSMMGCache();
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo75262o();

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m75250A(this.f50978c, iSudFSMStateHandle);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameDestroyed() {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameStarted() {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m75251B(iSudFSMStateHandle, str);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        m75252C(this.f50981f, iSudFSMStateHandle);
    }

    /* JADX INFO: renamed from: p */
    public final void m75263p(Act act, long j, String str) {
        String strMo75256i = mo75256i();
        String strMo75257j = mo75257j();
        SudInitSDKParamModel sudInitSDKParamModel = new SudInitSDKParamModel();
        sudInitSDKParamModel.context = act;
        sudInitSDKParamModel.appId = strMo75256i;
        sudInitSDKParamModel.appKey = strMo75257j;
        sudInitSDKParamModel.isTestEnv = mo75264q();
        sudInitSDKParamModel.userId = mo75262o();
        SudMGP.initSDK(sudInitSDKParamModel, new C12871b(act, str, j));
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo75264q();

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m75265r() {
        m75267t(f50975j);
    }

    /* JADX INFO: renamed from: s */
    public final void m75266s(Act act, String str, long j) {
        if (!act.isDestroyed() && this.f50980e && j == f50975j) {
            this.f50979d.setSudFSMMGListener(this);
            ISudFSTAPP iSudFSTAPPLoadMG = SudMGP.loadMG(act, mo75262o(), this.f50977b, str, j, mo75260m(), this.f50979d);
            if (iSudFSTAPPLoadMG == null) {
                if (mo75264q()) {
                    osi0.m165783g("loadMG params error");
                }
                m75254g(ErrorEnum.LOAD_MG_ERROR);
            } else {
                this.f50978c.setISudFSTAPP(iSudFSTAPPLoadMG);
                View gameView = iSudFSTAPPLoadMG.getGameView();
                this.f50981f = gameView;
                mo75269v(gameView);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m75267t(long j) {
        if (this.f50976a.isDestroyed() || j <= 0) {
            return;
        }
        mo75258k(mo75262o(), mo75256i(), new C12870a(j));
    }

    /* JADX INFO: renamed from: u */
    public final void m75268u(ISudFSMStateHandle iSudFSMStateHandle, int i, int i2) {
        GameViewInfoModel gameViewInfoModel = new GameViewInfoModel();
        gameViewInfoModel.ret_code = 0;
        GameViewInfoModel.GameViewSizeModel gameViewSizeModel = gameViewInfoModel.view_size;
        gameViewSizeModel.width = i;
        gameViewSizeModel.height = i2;
        mo75259l(gameViewInfoModel);
        iSudFSMStateHandle.success(SudJsonUtils.toJson(gameViewInfoModel));
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo75269v(View view);

    /* JADX INFO: renamed from: w */
    public void m75270w() {
        this.f50980e = false;
        m75255h();
    }

    /* JADX INFO: renamed from: x */
    public void m75271x() {
        this.f50978c.pauseMG();
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo75272y();

    /* JADX INFO: renamed from: z */
    public void m75273z() {
        this.f50978c.playMG();
    }
}
