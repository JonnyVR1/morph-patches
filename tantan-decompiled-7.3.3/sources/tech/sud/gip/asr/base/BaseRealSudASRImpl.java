package tech.sud.gip.asr.base;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPAPPState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.fug0;
import p153l.gog0;
import p153l.kjg0;
import p153l.kkg0;
import p153l.rwg0;
import p153l.srg0;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRealSudASRImpl implements Sudtry {
    private static final String FILE_TAG = "BaseRealSudASRImpl";
    private srg0 _matchASRInfoEvent;
    protected final InitASRParamModel _paramModel;
    protected boolean isIntentRunning;
    protected String mLanguage;
    protected gog0 mgCommonGameASR;
    private final String _TAG = "SudGIP ".concat(getClass().getSimpleName());
    protected HashSet<String> hitKeywordSet = new HashSet<>();

    public BaseRealSudASRImpl(InitASRParamModel initASRParamModel) {
        this._paramModel = initASRParamModel;
    }

    private void numberConver(String str, gog0 gog0Var) {
        Matcher matcher = Pattern.compile("[0-9]+").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            try {
                arrayList.add(Integer.valueOf(matcher.group()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (arrayList.size() > 0) {
            notifyAppCommonSelfTextHit(false, null, null, gog0Var.f105292d, null, arrayList);
        }
    }

    private void numberMatch(String str, gog0 gog0Var) {
        BaseRealSudASRImpl baseRealSudASRImpl;
        ArrayList arrayList;
        ArrayList arrayList2 = gog0Var.f105290b;
        if (arrayList2 == null || arrayList2.size() == 0) {
            return;
        }
        ArrayList arrayList3 = gog0Var.f105290b;
        int size = arrayList3.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String str2 = (String) arrayList3.get(i2);
            if (str2 == null || !str.contains(str2)) {
                baseRealSudASRImpl = this;
            } else {
                this.hitKeywordSet.add(str2);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(str2);
                try {
                    int i4 = Integer.parseInt(str2);
                    arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i4));
                } catch (Exception e) {
                    e.printStackTrace();
                    arrayList = null;
                }
                baseRealSudASRImpl = this;
                baseRealSudASRImpl.notifyAppCommonSelfTextHit(true, str2, null, gog0Var.f105292d, arrayList4, arrayList);
            }
            i2 = i3;
            this = baseRealSudASRImpl;
        }
        BaseRealSudASRImpl baseRealSudASRImpl2 = this;
        ArrayList arrayList5 = gog0Var.f105290b;
        int size2 = arrayList5.size();
        while (i < size2) {
            Object obj = arrayList5.get(i);
            i++;
            if (!baseRealSudASRImpl2.hitKeywordSet.contains((String) obj)) {
                return;
            }
        }
        baseRealSudASRImpl2.stopASR(true);
    }

    private void textMatch(String str, gog0 gog0Var) {
        BaseRealSudASRImpl baseRealSudASRImpl;
        ArrayList arrayList = gog0Var.f105290b;
        if (arrayList == null || arrayList.size() == 0 || str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ArrayList arrayList2 = gog0Var.f105290b;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj;
            if (str2 == null || !lowerCase.contains(str2.toLowerCase(Locale.getDefault()))) {
                baseRealSudASRImpl = this;
            } else {
                this.hitKeywordSet.add(str2);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(str2);
                baseRealSudASRImpl = this;
                baseRealSudASRImpl.notifyAppCommonSelfTextHit(true, str2, null, gog0Var.f105292d, arrayList3, null);
            }
            this = baseRealSudASRImpl;
        }
        BaseRealSudASRImpl baseRealSudASRImpl2 = this;
        ArrayList arrayList4 = gog0Var.f105290b;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            if (!baseRealSudASRImpl2.hitKeywordSet.contains((String) obj2)) {
                return;
            }
        }
        baseRealSudASRImpl2.stopASR(true);
    }

    public void displayException(Exception exc) {
        LogUtils.file(FILE_TAG, "displayException:" + LogUtils.getErrorInfo(exc));
        SudLogger.m222813e(this._TAG, exc.getMessage() + System.lineSeparator() + TextUtils.join(System.lineSeparator(), exc.getStackTrace()));
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public void handleGameASR(String str) {
        LogUtils.file(FILE_TAG, "handleGameASR:" + str);
        SudLogger.m222811d(this._TAG, "handleGameASR:" + str);
        if (TextUtils.isEmpty(str)) {
            this.mgCommonGameASR = null;
            stopASR(false);
            return;
        }
        gog0 gog0VarM131110a = gog0.m131110a(str);
        this.mgCommonGameASR = gog0VarM131110a;
        if (gog0VarM131110a == null) {
            stopASR(false);
            return;
        }
        if (!gog0VarM131110a.f105289a) {
            this.isIntentRunning = false;
            stopASR(true);
            return;
        }
        if (!isSupportWordType(gog0VarM131110a.f105292d)) {
            SudLogger.m222811d(this._TAG, "handleGameASR nonsupport:" + gog0VarM131110a.f105292d);
            LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + gog0VarM131110a.f105292d);
            return;
        }
        if ("text".equals(gog0VarM131110a.f105292d) && !isValidLanguage(this._paramModel.supportTextLanguageList, gog0VarM131110a.f105291c)) {
            SudLogger.m222811d(this._TAG, "handleGameASR nonsupport:" + gog0VarM131110a.f105291c);
            LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + gog0VarM131110a.f105291c);
            return;
        }
        if (!"number".equals(gog0VarM131110a.f105292d) || isValidLanguage(this._paramModel.supportNumberLanguageList, gog0VarM131110a.f105291c)) {
            this.isIntentRunning = true;
            String str2 = gog0VarM131110a.f105291c;
            this.mLanguage = str2;
            startASR(str2);
            return;
        }
        SudLogger.m222811d(this._TAG, "handleGameASR nonsupport:" + gog0VarM131110a.f105291c);
        LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + gog0VarM131110a.f105291c);
    }

    public boolean isSupportWordType(String str) {
        return "text".equals(str) || "number".equals(str);
    }

    public boolean isValidLanguage(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (string != null && !string.isEmpty() && string.equals(str)) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void notifyAppCommonSelfTextHit(boolean z, String str, String str2, String str3, List<String> list, List<Integer> list2) {
        kkg0 kkg0Var = new kkg0();
        kkg0Var.f127189a = z;
        kkg0Var.f127190b = str;
        kkg0Var.f127191c = str2;
        kkg0Var.f127192d = str3;
        kkg0Var.f127193e = list;
        kkg0Var.f127194f = list2;
        ISudFSTAPP iSudFSTAPP = this._paramModel.iSudFSTAPP.get();
        if (iSudFSTAPP != null) {
            iSudFSTAPP.notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_TEXT_HIT, kkg0Var.m150097a(), null);
            SudLogger.m222811d(this._TAG, "hit:" + kkg0Var.m150097a());
            LogUtils.file(FILE_TAG, "hit:" + kkg0Var.m150097a());
        }
    }

    public void onRecognizingResult(String str) {
        gog0 gog0Var;
        srg0 srg0Var = this._matchASRInfoEvent;
        if (srg0Var != null) {
            rwg0 rwg0Var = (rwg0) srg0Var;
            if (!rwg0Var.f165137d.booleanValue()) {
                rwg0Var.f165137d = Boolean.TRUE;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", rwg0Var.f165134a);
                    jSONObject.put("date", rwg0Var.f165136c);
                    rwg0Var.f165135b.f179401j.put("matchASR", jSONObject);
                    fug0.m127463b(rwg0Var.f165135b);
                    kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_sud_mgp_match_asr_last_date", rwg0Var.f165136c, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (TextUtils.isEmpty(str) || (gog0Var = this.mgCommonGameASR) == null || !gog0Var.f105289a) {
            return;
        }
        if ("text".equals(gog0Var.f105292d)) {
            if (gog0Var.f105293e) {
                textMatch(str, gog0Var);
            }
            if (gog0Var.f105294f) {
                notifyAppCommonSelfTextHit(false, null, str, gog0Var.f105292d, null, null);
                return;
            }
            return;
        }
        if ("number".equals(gog0Var.f105292d)) {
            if (gog0Var.f105293e) {
                numberMatch(str, gog0Var);
            }
            if (gog0Var.f105294f) {
                numberConver(str, gog0Var);
            }
        }
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public abstract /* synthetic */ void pushAudio(ByteBuffer byteBuffer, int i);

    public void setMatchASREvent(srg0 srg0Var) {
        this._matchASRInfoEvent = srg0Var;
    }

    public void startASR(String str) {
        this.hitKeywordSet.clear();
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public void stopASR(boolean z) {
        if (z) {
            this.isIntentRunning = false;
        }
        this.hitKeywordSet.clear();
    }
}
