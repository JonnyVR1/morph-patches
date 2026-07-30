package tech.sud.gip.asr.base;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPAPPState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p149l.cbg0;
import p149l.ccg0;
import p149l.jog0;
import p149l.kjg0;
import p149l.xlg0;
import p149l.yfg0;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRealSudASRImpl implements Sudtry {
    private static final String FILE_TAG = "BaseRealSudASRImpl";
    private kjg0 _matchASRInfoEvent;
    protected final InitASRParamModel _paramModel;
    protected boolean isIntentRunning;
    protected String mLanguage;
    protected yfg0 mgCommonGameASR;
    private final String _TAG = "SudGIP ".concat(getClass().getSimpleName());
    protected HashSet<String> hitKeywordSet = new HashSet<>();

    public BaseRealSudASRImpl(InitASRParamModel initASRParamModel) {
        this._paramModel = initASRParamModel;
    }

    private void numberConver(String str, yfg0 yfg0Var) {
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
            notifyAppCommonSelfTextHit(false, null, null, yfg0Var.f198059d, null, arrayList);
        }
    }

    private void numberMatch(String str, yfg0 yfg0Var) {
        BaseRealSudASRImpl baseRealSudASRImpl;
        ArrayList arrayList;
        ArrayList arrayList2 = yfg0Var.f198057b;
        if (arrayList2 == null || arrayList2.size() == 0) {
            return;
        }
        ArrayList arrayList3 = yfg0Var.f198057b;
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
                baseRealSudASRImpl.notifyAppCommonSelfTextHit(true, str2, null, yfg0Var.f198059d, arrayList4, arrayList);
            }
            i2 = i3;
            this = baseRealSudASRImpl;
        }
        BaseRealSudASRImpl baseRealSudASRImpl2 = this;
        ArrayList arrayList5 = yfg0Var.f198057b;
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

    private void textMatch(String str, yfg0 yfg0Var) {
        BaseRealSudASRImpl baseRealSudASRImpl;
        ArrayList arrayList = yfg0Var.f198057b;
        if (arrayList == null || arrayList.size() == 0 || str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ArrayList arrayList2 = yfg0Var.f198057b;
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
                baseRealSudASRImpl.notifyAppCommonSelfTextHit(true, str2, null, yfg0Var.f198059d, arrayList3, null);
            }
            this = baseRealSudASRImpl;
        }
        BaseRealSudASRImpl baseRealSudASRImpl2 = this;
        ArrayList arrayList4 = yfg0Var.f198057b;
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
        SudLogger.m221567e(this._TAG, exc.getMessage() + System.lineSeparator() + TextUtils.join(System.lineSeparator(), exc.getStackTrace()));
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public void handleGameASR(String str) {
        LogUtils.file(FILE_TAG, "handleGameASR:" + str);
        SudLogger.m221565d(this._TAG, "handleGameASR:" + str);
        if (TextUtils.isEmpty(str)) {
            this.mgCommonGameASR = null;
            stopASR(false);
            return;
        }
        yfg0 yfg0VarM214551a = yfg0.m214551a(str);
        this.mgCommonGameASR = yfg0VarM214551a;
        if (yfg0VarM214551a == null) {
            stopASR(false);
            return;
        }
        if (!yfg0VarM214551a.f198056a) {
            this.isIntentRunning = false;
            stopASR(true);
            return;
        }
        if (!isSupportWordType(yfg0VarM214551a.f198059d)) {
            SudLogger.m221565d(this._TAG, "handleGameASR nonsupport:" + yfg0VarM214551a.f198059d);
            LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + yfg0VarM214551a.f198059d);
            return;
        }
        if ("text".equals(yfg0VarM214551a.f198059d) && !isValidLanguage(this._paramModel.supportTextLanguageList, yfg0VarM214551a.f198058c)) {
            SudLogger.m221565d(this._TAG, "handleGameASR nonsupport:" + yfg0VarM214551a.f198058c);
            LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + yfg0VarM214551a.f198058c);
            return;
        }
        if (!"number".equals(yfg0VarM214551a.f198059d) || isValidLanguage(this._paramModel.supportNumberLanguageList, yfg0VarM214551a.f198058c)) {
            this.isIntentRunning = true;
            String str2 = yfg0VarM214551a.f198058c;
            this.mLanguage = str2;
            startASR(str2);
            return;
        }
        SudLogger.m221565d(this._TAG, "handleGameASR nonsupport:" + yfg0VarM214551a.f198058c);
        LogUtils.file(FILE_TAG, "handleGameASR nonsupport:" + yfg0VarM214551a.f198058c);
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
        ccg0 ccg0Var = new ccg0();
        ccg0Var.f80236a = z;
        ccg0Var.f80237b = str;
        ccg0Var.f80238c = str2;
        ccg0Var.f80239d = str3;
        ccg0Var.f80240e = list;
        ccg0Var.f80241f = list2;
        ISudFSTAPP iSudFSTAPP = this._paramModel.iSudFSTAPP.get();
        if (iSudFSTAPP != null) {
            iSudFSTAPP.notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_TEXT_HIT, ccg0Var.m106049a(), null);
            SudLogger.m221565d(this._TAG, "hit:" + ccg0Var.m106049a());
            LogUtils.file(FILE_TAG, "hit:" + ccg0Var.m106049a());
        }
    }

    public void onRecognizingResult(String str) {
        yfg0 yfg0Var;
        kjg0 kjg0Var = this._matchASRInfoEvent;
        if (kjg0Var != null) {
            jog0 jog0Var = (jog0) kjg0Var;
            if (!jog0Var.f118977d.booleanValue()) {
                jog0Var.f118977d = Boolean.TRUE;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", jog0Var.f118974a);
                    jSONObject.put("date", jog0Var.f118976c);
                    jog0Var.f118975b.f133120j.put("matchASR", jSONObject);
                    xlg0.m209889b(jog0Var.f118975b);
                    cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_sud_mgp_match_asr_last_date", jog0Var.f118976c, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (TextUtils.isEmpty(str) || (yfg0Var = this.mgCommonGameASR) == null || !yfg0Var.f198056a) {
            return;
        }
        if ("text".equals(yfg0Var.f198059d)) {
            if (yfg0Var.f198060e) {
                textMatch(str, yfg0Var);
            }
            if (yfg0Var.f198061f) {
                notifyAppCommonSelfTextHit(false, null, str, yfg0Var.f198059d, null, null);
                return;
            }
            return;
        }
        if ("number".equals(yfg0Var.f198059d)) {
            if (yfg0Var.f198060e) {
                numberMatch(str, yfg0Var);
            }
            if (yfg0Var.f198061f) {
                numberConver(str, yfg0Var);
            }
        }
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public abstract /* synthetic */ void pushAudio(ByteBuffer byteBuffer, int i);

    public void setMatchASREvent(kjg0 kjg0Var) {
        this._matchASRInfoEvent = kjg0Var;
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
