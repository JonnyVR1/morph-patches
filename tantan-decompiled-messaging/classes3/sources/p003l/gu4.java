package p003l;

import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import java.util.List;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gu4 {
    /* JADX INFO: renamed from: a */
    public static void m4700a(List<IceBreakingQuestion> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            int i = 0;
            while (i < list.size()) {
                IceBreakingQuestion iceBreakingQuestion = list.get(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", iceBreakingQuestion.id);
                jSONObject3.put("content", iceBreakingQuestion.content);
                i++;
                jSONObject2.put(String.valueOf(i), jSONObject3);
            }
            jSONObject.put("chat_topics", jSONObject2);
        } catch (Exception unused) {
        }
        zvf0.z("e_opposite_topic", "p_chat_view", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static void m4701b(String str, IceBreakingQuestion iceBreakingQuestion) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", iceBreakingQuestion.id);
            jSONObject3.put("content", iceBreakingQuestion.content);
            jSONObject2.put(str, jSONObject3);
            jSONObject.put("chat_topics", jSONObject2);
        } catch (JSONException unused) {
        }
        zvf0.t("e_opposite_topic", "p_chat_view", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static void m4702c(String str, List<IceBreakingQuestion> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (i < list.size()) {
                IceBreakingQuestion iceBreakingQuestion = list.get(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", iceBreakingQuestion.id);
                jSONObject2.put("content", iceBreakingQuestion.content);
                i++;
                jSONObject.put(String.valueOf(i), jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("chat_topics", jSONObject);
            zvf0.t("e_save_topic", str, jSONObject3);
        } catch (Exception unused) {
        }
    }
}
