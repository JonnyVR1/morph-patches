package p153l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiV2Act;
import com.p051p1.mobile.putong.account.p055ui.accountai.frag.SignUpAgeFrag;
import com.p051p1.mobile.putong.account.p055ui.accountai.frag.SignUpGenderFrag;
import com.p051p1.mobile.putong.account.p055ui.accountai.frag.SignUpNameFrag;
import com.p051p1.mobile.putong.account.p055ui.accountai.frag.SignUpPortraitFrag;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.StepSeekBar;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import p151v.VButton_FakeShadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class mgf0 extends jbf0<ref0, SignUpAiV2Act> {

    /* JADX INFO: renamed from: x */
    public static String[] f136710x = {"诗沫涵", "凤浩然", "惜沫", "桃花仙", "命中赐", "泪染渍", "表情帝", "泪眼", "三年终", "丑丑阿", "陌心", "小灰鸡", "修静轩", "雪颖呐", "清泉谛", "孤星泪", "沈明轩", "苏以北", "天梭云影", "时光印记", "火云箭手", "溯雨潇潇", "天山童老", "贩甜少女", "空大女王", "独白炫霾", "惜醉颜", "夜灵霜影", "韩系女孩", "舞会女王", "坠落枯叶", "可乐可乐", "莎士小姐", "欢乐男孩", "为你歌唱", "幻墨烟", "瑶冰紫焉", "凉了夏天", "奇葩男友", "爱情纯真", "小马同学", "嫦娥水晶", "安汐子", "学酥很浅", "可忆的冷", "小暧昧", "通心境话", "奥拓", "枫叶晓寒", "小小塵埃", "妳在我安", "单身少女", "黑色忧郁", "独月夜", "岚芷幽嘉", "飘落无踪", "素颜如水", "深渊骑士", "听我笑吧", "加拉哈德", "心海扬波", "零落情话", "十字路口", "安康永乐", "动感帽饰", "吻眼吹沙", "不慌无恙", "笙歌未央", "场控帝王", "浅色青鸾", "创意小屋", "倾世璃歌", "久别珍重", "青蛙公主", "风林语嫣", "温柔无极", "浮华蜃楼", "战神美女", "持刀女将", "孤峰无伴", "聚宝坑", "微光壹夏", "如花似玉", "久居我心", "夕颜若雪", "酒馆打烊", "天蓝褶皱", "热情会冷", "秋天的童话", "舞所谓", "時光漫步", "眼眸印温柔", "喵一曲挽歌", "沫汐", "陌希", "青梅竹马意", "待故人归来", "温暖到最终", "仙女有翅膀", "海洋味红酒", "和幸福干杯", "演绎新秀", "耳边唱情歌", "挽风说笑", "卖梦商人", "花渐影", "小桃花", "做你中意人", "长醉不曾醒", "白日做梦", "狂风中相遇", "浇熄言语", "清风掳我心", "殊途同归", "逝爱", "小小的感动", "汐染季沫", "独步天下", "守足无措", "北幕", "南辞", "刻骨抵温柔", "自以为爱", "清秀如初", "梨花薰雨", "醉渺茫", "许我七日暖", "拿糖糖换", "当初的我们", "独领五尊", "南城荒芜", "卑微的借口", "刺猬的拥抱", "可爱的狗蛋", "纯黑纯白", "你好徐小姐", "仗着喜欢", "诊断你的心", "纯情大灰狼", "空城旧少年", "右手边的我", "璎花雪", "未清一份爱", "无力挽留谁", "只为你一人", "少女娃娃机", "虫儿飞", "雪花女孩", "午夜鹣鹣梦", "小班的小白", "看风景的人", "最温暖的墙", "会飞的鱼", "暮雨打梨花", "轻雨漫云峰", "演绎岁月", "幸福下载中", "烟花一瞬间", "箫声起泪决堤", "眼成海卻未藍", "折扇戏美人", "软妹型小仙女", "月下独酌求醉", "会飞的雨", "追忆的小青年", "歌一程酒一壶", "前奏後曲", "忘情水水上花", "未長大的幸福", "伤心戒伴抹星", "会飞的风", "余温散尽", "被退回的礼物", "送你辣条", "无止尽的温柔", "悲伤里的阳光", "柠檬味嘎嘣脆", "那美好的回忆", "会飞的蓝鸟", "会飞的猫", "结果措手不及", "仅有的唯一", "放飞的鹞子", "曾经海誓山盟", "来日不方长", "小傻瓜大笨蛋", "沒有颜色天空", "花落念伊人", "停滞在朝暮里", "苏暮奈", "歇斯底里德笑", "逛逛道人飞了", "蹲在墙头等你", "愿时光静好", "梦中人现红尘", "独特的乖乖", "嘴角的浅笑", "深海里的浅鱼", "爱在美丽神话", "谈理想说梦想", "谁卑微的承诺", "任凭年华老去", "麦是麦兜的麦", "一乐泯恩怨", "End落幕", "陪你到时光褪尽", "把我打包带走吧", "糖果味小仙儿", "马尾上的蝴蝶结", "致命旳夹竹桃", "猫与你不可缺一", "不分手的恋爱", "指间温暖奶茶店", "霸气震天你蒋爷", "主導愛的梅壹秒", "终极者夜舞馆", "腐烂的奈何桥", "卖女孩点火柴", "爱点火柴", "青风缠月浪碎银", "夜深人静的时分", "一缕繁华如似梦", "长的丑活的久", "只待佳人美红颜", "蓝色的云舞不乖", "影响天气的心情", "一生热爱不回头", "新的迷恋", "寒冷的冰", "能不能好好恋爱", "溺水三千不敌你", "命运说不出的伤", "我们仅此而已", "冷言冷语冷记忆", "烟雨楼", "泪是咸的", "爱上这座城", "好喝的清茶", "甜猫储存室", "养只狗叫橙子", "太平间公主", "小熊被偷走了", "今晚去捕目亮", "哒哒的铃铛", "来一份甜豆", "肥冉小朋友", "卷毛小桃子", "有个超人叫咸蛋", "来杯旺崽牛奶", "养猪仙", "昨日牧尘", "挽轻轻风", "余挽", "辞镜", "栀染", "陌笙", "甜美", "对的甜味", "囍笑", "阿葵", "栀蓝", "蓝莓奶昔", "念念康康", "爱听歌的鱼", "歪念", "阿璃", "孤魂", "心房", "千寻", "孤岛", "風光", "好香的小红花", "稳妥", "未亡", "长夜漫游", "鸯旧", "归隐", "甜恋", "痴人心", "桃花扇", "白云味棉花糖", "星辰与曦月", "初夏那抹浅蓝", "亦徒", "竹忆", "青染", "凊若", "鹿味仙", "末将姓", "书生敬山", "过尽千帆", "识汝不识丁", "南海菇凉", "千人憎", "顾我安稳", "甜柠檬", "素弦幽梦", "墨染幽篁", "浅吟流年", "青笺绘诗", "云岫逸客", "落梅听雨", "沐风吟月", "莲心素韵", "幽涧寻芳", "烟柳画桥", "碧霄云鹤", "素手挽清风", "墨韵凝香", "绮梦潇湘", "冷月葬花魂", "可爱俏皮喵", "糖果小萌主", "元气喵酱", "泡泡小熊", "甜豆吖", "俏皮桃桃", "萌兔叽", "星星糖宝", "奶凶小可爱", "布丁喵呜", "草莓卷卷", "糯糯小仙女", "萌面小侠", "松果萌萌", "彩虹泡泡糖", "甜心软糖", "乐乐爱文艺", "微光浅吟", "素年锦时", "浅岸听风", "森林与诗", "静听花语", "青柠时光", "悠云逸梦", "清风墨竹", "湖畔听琴", "晨露润心", "樱落素笺", "白茶与风", "琉璃浅梦", "听雪吟霜", "暖阳浅绘", "阳简约", "简逸", "酷盖阿星", "时尚潮咖", "摩登先锋", "简约风影", "冷调酷仔", "潮流前线", "极简格调", "都市风尚", "炫酷达人", "潮流教主", "简约逸客", "酷玩一族", "时尚捕手", "潮范先锋", "神秘的椰子", "暗夜幽影", "幻影谜踪", "幽秘星辰", "灵犀探秘", "迷雾幻心", "月影谜客", "深渊凝视", "幻夜幽光", "空灵幻梦", "星穹秘语", "幽谧使者", "玄影谜踪", "暗域灵犀", "紫幻幽梦", "逆空谜影", "励志的叶子", "逐梦之光", "奋进先锋", "拼搏少年郎", "逆袭王者", "梦想起航站", "励志小飞侠", "破茧成蝶者", "崛起之路", "热血逐风", "坚毅追梦人", "勇攀高峰者", "奋进青年派", "冲霄凌云志", "励志领航员", "糖果城堡主", "镭射酷仔", "幻影潮咖", "仙境萌友", "精灵梦旅人", "闪电的动漫人"};

    /* JADX INFO: renamed from: c */
    public VRelative f136711c;

    /* JADX INFO: renamed from: d */
    public StepSeekBar f136712d;

    /* JADX INFO: renamed from: e */
    public VImage f136713e;

    /* JADX INFO: renamed from: f */
    public VText f136714f;

    /* JADX INFO: renamed from: g */
    public VScroll f136715g;

    /* JADX INFO: renamed from: h */
    public VLinear f136716h;

    /* JADX INFO: renamed from: i */
    public ViewPager2 f136717i;

    /* JADX INFO: renamed from: j */
    public VButton_FakeShadow f136718j;

    /* JADX INFO: renamed from: k */
    public View f136719k;

    /* JADX INFO: renamed from: l */
    public final List<Frag> f136720l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<Animator> f136721m;

    /* JADX INFO: renamed from: n */
    public SignUpData f136722n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final jxd0 f136723o;

    /* JADX INFO: renamed from: p */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final jxd0 f136724p;

    /* JADX INFO: renamed from: q */
    public String f136725q;

    /* JADX INFO: renamed from: r */
    public SignUpGenderFrag f136726r;

    /* JADX INFO: renamed from: s */
    public SignUpAgeFrag f136727s;

    /* JADX INFO: renamed from: t */
    public SignUpNameFrag f136728t;

    /* JADX INFO: renamed from: u */
    public SignUpPortraitFrag f136729u;

    /* JADX INFO: renamed from: v */
    public final C18611b f136730v;

    /* JADX INFO: renamed from: w */
    public int f136731w;

    /* JADX INFO: renamed from: l.mgf0$a */
    public class DialogInterfaceOnDismissListenerC18610a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f136732a;

        public DialogInterfaceOnDismissListenerC18610a(l4g0 l4g0Var) {
            this.f136732a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f136732a);
        }
    }

    public mgf0(@NonNull SignUpAiV2Act signUpAiV2Act) {
        super(signUpAiV2Act);
        this.f136720l = new ArrayList();
        this.f136721m = new ArrayList<>();
        String str = "has_jump_" + AccountModule.m29130F().userId();
        Boolean bool = Boolean.FALSE;
        this.f136723o = new jxd0(str, bool);
        this.f136724p = new jxd0("has_submit_jump_" + AccountModule.m29130F().userId(), bool);
        this.f136725q = "肥冉小朋友";
        this.f136730v = new C18611b();
        this.f136731w = -1;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ dgq0 m158220K(View view, dgq0 dgq0Var) {
        view.setPadding(0, 0, 0, dgq0Var.m115683i());
        return dgq0Var;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m158223N(Throwable th) {
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m158228S() {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m158232W() {
    }

    /* JADX INFO: renamed from: o0 */
    public static String m158251o0(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            if (random.nextBoolean()) {
                sb.append((char) (random.nextInt(26) + 65));
            } else {
                sb.append((char) (random.nextInt(26) + 97));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m158252p(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static String m158253p0(SignUpData signUpData) {
        int iMin = Math.min(f136710x.length, new Random().nextInt(f136710x.length));
        StringBuilder sb = new StringBuilder();
        sb.append(f136710x[iMin]);
        sb.append(m158251o0(4));
        sb.append((signUpData == null || !TEnum.equals(signUpData.gender, "female")) ? "m" : "f");
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m158254q() {
    }

    /* JADX INFO: renamed from: r */
    private void m158255r() {
        m144220e(this.f136711c);
        m158314q0();
        this.f136717i.setAdapter(new udf0(((SignUpAiV2Act) this.f119872a).getSupportFragmentManager(), ((SignUpAiV2Act) this.f119872a).getLifecycle(), this.f136720l));
        this.f136717i.m4249g(this.f136730v);
        this.f136717i.setUserInputEnabled(false);
        kkl0.m150194y0(this.f136715g, new il50() { // from class: l.sef0
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return mgf0.m158220K(view, dgq0Var);
            }
        });
        this.f136712d.setMax(4);
        this.f136712d.setProgress(1);
        this.f136712d.setTouchEnable(false);
        ((ref0) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f136719k)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.dff0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88153a.m158325w0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m158256r0() {
        String str = ike.m140276h().f115357c.get();
        return TextUtils.equals("goto_lie_tavern", str) || TextUtils.equals("goto_business_chatroom", str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m158258u(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m158259v(View view, ViewPager2 viewPager2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = view.getMeasuredHeight();
            viewPager2.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m158264A0() {
        l51.m152888H(getContext(), new Runnable() { // from class: l.bgf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76618a.m158330z0();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m158265A1() {
        if (C16074bp.m105753h()) {
            this.f136723o.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m158266B0(x20 x20Var, Gender gender) {
        m158265A1();
        m158322u1("");
        m158331z1(gender, x20Var);
        ((ref0) this.f119873b).m139328O0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m158267B1() {
        if (C16074bp.m105753h()) {
            bnl0.m105525M0(this.f136714f, false);
        }
    }

    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public final void m158281K0(String str, kcg0 kcg0Var, x20 x20Var) {
        AccountModule.f16756c.m29338j2(str);
        m158280J1(kcg0Var, x20Var, str);
        i4g0.m138520r("e_ai_signup_name", "p_ai_signup");
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m158269D0(x20 x20Var) {
        m158265A1();
        m158322u1("");
        m158331z1(Gender.get("male"), x20Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m158270E0(x20 x20Var) {
        bnl0.m105525M0(this.f136714f, false);
        m158331z1(Gender.get("female"), x20Var);
    }

    /* JADX INFO: renamed from: E1 */
    public void m158271E1(int i) {
        if (i < 1) {
            return;
        }
        if (m158256r0()) {
            i = Math.min(2, i);
        }
        this.f136712d.setProgress(i, true);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m158272F1(String str, String str2, final String str3, final x20 x20Var, final x20 x20Var2) {
        final String str4;
        if ("gender".equals(str3)) {
            str4 = "p_ai_signup_gender_skip_pop";
        } else if (SeeTextDynamicParam.age.equals(str3)) {
            str4 = "p_ai_signup_age_skip_pop";
        } else if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(str3)) {
            str4 = "p_ai_signup_name_skip_pop";
        } else {
            str4 = ReminderAction.photo.equals(str3) ? "p_ai_signup_photo_skip_pop" : "";
        }
        l4g0 l4g0VarM204399c = w1e.m204399c(str4, Dialog.class.getName());
        th0.C20312a c20312aM191144c = new th0.C20312a(this.f119872a).m191151j(str).m191159r(str2).m191147f("仍要跳过").m191148g(false).m191154m(new DialogInterfaceOnDismissListenerC18610a(l4g0VarM204399c)).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.egf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93924a.m158299e1(str4, str3, x20Var, view);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.fgf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98927a.m158300f1(str4, str3, x20Var2, view);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        c20312aM191144c.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m158273G0(final x20 x20Var, View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", "gender"));
        m158310n0();
        m158272F1("系统默认您为“女性”方便为您精准匹配用户，性别更改机会只有一次", "我是男生", "gender", new x20() { // from class: l.kff0
            @Override // p153l.x20
            public final void call() {
                this.f126388a.m158269D0(x20Var);
            }
        }, new x20() { // from class: l.lff0
            @Override // p153l.x20
            public final void call() {
                this.f131844a.m158270E0(x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: G1 */
    public final void m158274G1(String str, String str2, boolean z) {
        boolean zEquals = "gender".equals(str2);
        String str3 = FreeSpaceBox.TYPE;
        if (zEquals) {
            if (z) {
                str3 = "choose_male";
            }
            i4g0.m138523u("e_ai_signup_gender_skip_pop_again", str, pf60.m172085a("skip_gender", str3));
            return;
        }
        if (SeeTextDynamicParam.age.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            i4g0.m138523u("e_ai_signup_age_skip_pop_again", str, pf60.m172085a("skip_pop_age", str3));
        } else if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            i4g0.m138523u("e_ai_signup_name_skip_pop_again", str, pf60.m172085a("skip_pop_name", str3));
        } else if (ReminderAction.photo.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            i4g0.m138523u("e_ai_signup_photo_skip_pop_again", str, pf60.m172085a("skip_pop_photo", str3));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m158275H0(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SignUpNameFrag signUpNameFrag = this.f136728t;
        if (zBooleanValue) {
            signUpNameFrag.m29425J4(this.f119872a);
        } else {
            signUpNameFrag.m29421D4();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m158276H1(boolean z) {
        this.f136718j.setClickable(z);
        VButton_FakeShadow vButton_FakeShadow = this.f136718j;
        if (z) {
            vButton_FakeShadow.setBackgroundResource(bbc0.f75818L1);
        } else {
            vButton_FakeShadow.setBackgroundResource(bbc0.f75920u1);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m158277I0() {
        if (NullChecker.m82486a(act())) {
            act().hideInput(this.f136719k);
            m158271E1(4);
            ((ref0) this.f119873b).m181021u1();
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m158278I1(final View view, final ViewPager2 viewPager2) {
        if (NullChecker.m82486a(view)) {
            view.post(new Runnable() { // from class: l.aff0
                @Override // java.lang.Runnable
                public final void run() {
                    mgf0.m158259v(view, viewPager2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m158279J0() {
        l51.m152888H(getContext(), new Runnable() { // from class: l.rff0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162780a.m158277I0();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m158280J1(final kcg0 kcg0Var, final x20 x20Var, String str) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("login");
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "nikeName";
        detectTextNew_.value = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        ((ref0) this.f119873b).m139329P0(detectRequestNew_, null, AccountTempApi.SignUpType.nameInfoSaved, new x20() { // from class: l.sff0
            @Override // p153l.x20
            public final void call() {
                this.f167693a.m158301g1(x20Var, kcg0Var);
            }
        }, new y20() { // from class: l.tff0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173952a.m158302h1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m158282L0(Boolean bool) {
        m158276H1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m158283M0(View view) {
        i4g0.m138520r("e_ai_signup_chage_name_button", ((SignUpAiV2Act) this.f119872a).pageId());
        m158311n1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m158284N0() {
        this.f136728t.m29423F4(C16649dy.m118580o0(AccountModule.f16756c.m29289I2().get()));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m158285O0(kcg0 kcg0Var, x20 x20Var) {
        bnl0.m105525M0(this.f136714f, false);
        m158281K0(!TextUtils.isEmpty(this.f136728t.m29422E4()) ? this.f136728t.m29422E4() : this.f136725q, kcg0Var, x20Var);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m158286P0(final kcg0 kcg0Var, final x20 x20Var, View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", AuthenticationTokenClaims.JSON_KEY_NAME));
        m158310n0();
        m158272F1("填写“昵称”方便别人更快记住你，若仍要跳过，系统将随机展示昵称，您可进入后自行更改", "继续填写", AuthenticationTokenClaims.JSON_KEY_NAME, new x20() { // from class: l.vff0
            @Override // p153l.x20
            public final void call() {
                mgf0.m158228S();
            }
        }, new x20() { // from class: l.wff0
            @Override // p153l.x20
            public final void call() {
                this.f188841a.m158285O0(kcg0Var, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m158287Q0() {
        ((ref0) this.f119873b).m181015f1(false, TextUtils.equals("DouyinTantan01", ls4.m155671b()));
        i4g0.m138520r("e_ai_signup_photo", "p_ai_signup");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m158288R0() {
        ((ref0) this.f119873b).m181013B1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m158289S0(View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", ReminderAction.photo));
        m158310n0();
        m158272F1("跳过将会影响您进入后匹配用户的体验", "继续上传", ReminderAction.photo, new x20() { // from class: l.mff0
            @Override // p153l.x20
            public final void call() {
                mgf0.m158254q();
            }
        }, new x20() { // from class: l.nff0
            @Override // p153l.x20
            public final void call() {
                this.f141738a.m158288R0();
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m158290T0() {
        this.f136715g.fullScroll(130);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m158291U0() {
        ((ref0) this.f119873b).m181021u1();
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m158292V0(RegisterNameEnvelope registerNameEnvelope) {
        if (NullChecker.m82486a(registerNameEnvelope) && NullChecker.m82486a(registerNameEnvelope.data) && !TextUtils.isEmpty(registerNameEnvelope.data.name)) {
            String str = registerNameEnvelope.data.name;
            this.f136725q = str;
            this.f136728t.m29423F4(C16649dy.m118580o0(str));
            m158276H1(!TextUtils.isEmpty(this.f136728t.m29422E4()));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m158293W0(View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", ReminderAction.photo));
        m158310n0();
        ((ref0) this.f119873b).m181013B1();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m158294X0() {
        i4g0.m138520r("e_signup_complete", ((SignUpAiV2Act) this.f119872a).pageId());
        ((ref0) this.f119873b).m181013B1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m158295Y0() {
        m158271E1(3);
        ((ref0) this.f119873b).m181021u1();
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m158296Z0() {
        m158267B1();
        l51.m152888H(getContext(), new Runnable() { // from class: l.uff0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178757a.m158295Y0();
            }
        }, 200L);
        i4g0.m138526x("e_ai_signup_birthday_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m158297a1(x20 x20Var) {
        m158267B1();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        i4g0.m138526x("e_ai_signup_gender_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m158298d1(Throwable th) {
        this.f136726r.m29411B4();
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
        super.destroy();
        int i = 0;
        while (true) {
            int size = this.f136721m.size();
            ArrayList<Animator> arrayList = this.f136721m;
            if (i >= size) {
                arrayList.clear();
                this.f136717i.m4256n(this.f136730v);
                return;
            } else {
                if (NullChecker.m82486a(arrayList.get(i)) && this.f136721m.get(i).isRunning()) {
                    this.f136721m.get(i).cancel();
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m158299e1(String str, String str2, x20 x20Var, View view) {
        m158274G1(str, str2, true);
        x20Var.call();
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m158300f1(String str, String str2, x20 x20Var, View view) {
        m158274G1(str, str2, false);
        x20Var.call();
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m158301g1(x20 x20Var, kcg0 kcg0Var) {
        m158267B1();
        x20Var.call();
        psd0.m173633z(kcg0Var);
        i4g0.m138526x("e_ai_signup_name_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m158302h1(Throwable th) {
        m158306l0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f136719k = m158304k0(layoutInflater, viewGroup);
        m158255r();
        return this.f136719k;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m158303j1() {
        this.f136727s.m29403C4(this.f136722n);
        m158316r1();
        m158322u1(SeeTextDynamicParam.age);
        i4g0.m138526x("e_ai_signup_age", "p_ai_signup");
        bnl0.m105509E0(this.f136714f, new View.OnClickListener() { // from class: l.bff0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76488a.m158328y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public View m158304k0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ngf0.m162965b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k1 */
    public void m158305k1() {
        m158316r1();
        m158322u1("gender");
        i4g0.m138526x("e_ai_signup_gender", "p_ai_signup");
        final x20 x20Var = new x20() { // from class: l.xef0
            @Override // p153l.x20
            public final void call() {
                this.f193931a.m158264A0();
            }
        };
        this.f136726r.m29413G4(new y20() { // from class: l.yef0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199343a.m158266B0(x20Var, (Gender) obj);
            }
        });
        bnl0.m105509E0(this.f136714f, new View.OnClickListener() { // from class: l.zef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204003a.m158273G0(x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m158306l0() {
        m158276H1(true);
        this.f136728t.m29419B4();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m158307l1() {
        m158316r1();
        m158276H1(!TextUtils.isEmpty(this.f136728t.m29422E4()));
        final kcg0 kcg0VarSubscribe = ((ref0) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f136719k)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.jgf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120711a.m158275H0((Boolean) obj);
            }
        }));
        final x20 x20Var = new x20() { // from class: l.kgf0
            @Override // p153l.x20
            public final void call() {
                this.f126599a.m158279J0();
            }
        };
        this.f136728t.m29427L4(new y20() { // from class: l.lgf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131957a.m158281K0(kcg0VarSubscribe, x20Var, (String) obj);
            }
        }, new y20() { // from class: l.tef0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173809a.m158282L0((Boolean) obj);
            }
        });
        this.f136728t.m29425J4(this.f119872a);
        if (C16074bp.m105753h()) {
            m158322u1(AuthenticationTokenClaims.JSON_KEY_NAME);
        }
        this.f136728t.m29426K4(C16074bp.m105753h(), new View.OnClickListener() { // from class: l.uef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178650a.m158283M0(view);
            }
        });
        if (!TextUtils.isEmpty(AccountModule.f16756c.m29289I2().get())) {
            l51.m152887G(new Runnable() { // from class: l.vef0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183763a.m158284N0();
                }
            });
        } else if (C16074bp.m105753h()) {
            m158311n1();
        }
        i4g0.m138526x("e_ai_signup_name", "p_ai_signup");
        bnl0.m105509E0(this.f136714f, new View.OnClickListener() { // from class: l.wef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188692a.m158286P0(kcg0VarSubscribe, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m158308m0(int i) {
        m158278I1(this.f136720l.get(i).getView(), this.f136717i);
        bnl0.m105509E0(this.f136718j, null);
        if (i == 0) {
            bnl0.m105524M(this.f136718j, false);
            m158305k1();
            return;
        }
        if (i == 1) {
            bnl0.m105524M(this.f136718j, true);
            m158276H1(true);
            bnl0.m105509E0(this.f136718j, new View.OnClickListener() { // from class: l.off0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147071a.m158317s0(view);
                }
            });
            m158303j1();
            return;
        }
        if (i == 2) {
            bnl0.m105524M(this.f136718j, true);
            bnl0.m105509E0(this.f136718j, new View.OnClickListener() { // from class: l.zff0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204131a.m158319t0(view);
                }
            });
            m158307l1();
        } else {
            if (i != 3) {
                return;
            }
            bnl0.m105524M(this.f136718j, false);
            m158309m1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m158309m1() {
        m158316r1();
        if (NullChecker.m82486a(this.f136722n.gender)) {
            zif0.f204509T.put(this.f136722n.gender.toString());
        } else {
            wyd0 wyd0Var = zif0.f204509T;
            if (!TextUtils.isEmpty(wyd0Var.get())) {
                this.f136722n.gender = Gender.get(wyd0Var.get());
            }
        }
        this.f136729u.m29437D4(this.f136722n.gender);
        this.f136729u.m29436C4(new x20() { // from class: l.cff0
            @Override // p153l.x20
            public final void call() {
                this.f81509a.m158287Q0();
            }
        });
        if (C16074bp.m105753h()) {
            bnl0.m105525M0(this.f136714f, true);
            i4g0.m138492A("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", ReminderAction.photo));
        }
        i4g0.m138526x("e_ai_signup_photo_template", "p_ai_signup");
        i4g0.m138526x("e_ai_signup_photo", "p_ai_signup");
        bnl0.m105509E0(this.f136714f, new View.OnClickListener() { // from class: l.eff0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93771a.m158289S0(view);
            }
        });
        this.f136715g.postDelayed(new Runnable() { // from class: l.fff0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98764a.m158290T0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m158310n0() {
        if (this.f136724p.get().booleanValue()) {
            return;
        }
        ((SignUpAiV2Act) this.f119872a).duringCreated(AccountModule.f16756c.m29355s2()).subscribe(psd0.m173597H(new y20() { // from class: l.gff0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103902a.m158321u0((uxj0) obj);
            }
        }, new y20() { // from class: l.hff0
            @Override // p153l.y20
            public final void call(Object obj) {
                mgf0.m158258u((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n1 */
    public final void m158311n1() {
        m158312o1(false);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m158312o1(boolean z) {
        if (!z) {
            ((SignUpAiV2Act) this.f119872a).duringCreated(AccountModule.f16756c.m29320a1()).subscribe(psd0.m173597H(new y20() { // from class: l.yff0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f199515a.m158292V0((RegisterNameEnvelope) obj);
                }
            }, new y20() { // from class: l.agf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    mgf0.m158223N((Throwable) obj);
                }
            }));
            return;
        }
        String strM158253p0 = m158253p0(this.f136722n);
        this.f136725q = strM158253p0;
        this.f136728t.m29423F4(C16649dy.m118580o0(strM158253p0));
        m158281K0(strM158253p0, null, new x20() { // from class: l.xff0
            @Override // p153l.x20
            public final void call() {
                this.f194030a.m158291U0();
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public void m158313p1(SignUpData signUpData, boolean z) {
        this.f136722n = signUpData;
        m158329y1(1, z);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m158314q0() {
        SignUpGenderFrag signUpGenderFragM29408F4 = SignUpGenderFrag.m29408F4();
        this.f136726r = signUpGenderFragM29408F4;
        this.f136720l.add(signUpGenderFragM29408F4);
        SignUpAgeFrag signUpAgeFragM29399B4 = SignUpAgeFrag.m29399B4();
        this.f136727s = signUpAgeFragM29399B4;
        this.f136720l.add(signUpAgeFragM29399B4);
        SignUpNameFrag signUpNameFragM29416I4 = SignUpNameFrag.m29416I4();
        this.f136728t = signUpNameFragM29416I4;
        this.f136720l.add(signUpNameFragM29416I4);
        SignUpPortraitFrag signUpPortraitFragM29433B4 = SignUpPortraitFrag.m29433B4();
        this.f136729u = signUpPortraitFragM29433B4;
        this.f136720l.add(signUpPortraitFragM29433B4);
        this.f136729u.m29436C4(new x20() { // from class: l.ggf0
            @Override // p153l.x20
            public final void call() {
                this.f104019a.m158323v0();
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m158315q1() {
        bnl0.m105525M0(this.f136714f, true);
        bnl0.m105509E0(this.f136714f, new View.OnClickListener() { // from class: l.cgf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81664a.m158293W0(view);
            }
        });
        if (C16074bp.m105752g()) {
            i4g0.m138526x("e_signup_complete", ((SignUpAiV2Act) this.f119872a).pageId());
            this.f136729u.m29436C4(new x20() { // from class: l.dgf0
                @Override // p153l.x20
                public final void call() {
                    this.f88297a.m158294X0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m158316r1() {
        C16330cp.m111722h();
        bnl0.m105525M0(this.f136713e, false);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m158317s0(View view) {
        i4g0.m138524v("e_ai_signup_age", "p_ai_signup", new pf60[0]);
        m158265A1();
        m158322u1("");
        m158326w1(this.f136727s.m29402A4());
    }

    /* JADX INFO: renamed from: s1 */
    public void m158318s1(boolean z) {
        ((ref0) this.f119873b).m139328O0();
        m158329y1(0, z);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m158319t0(View view) {
        this.f136728t.m29420C4();
        m158276H1(!TextUtils.isEmpty(this.f136728t.m29422E4()));
    }

    /* JADX INFO: renamed from: t1 */
    public void m158320t1(SignUpData signUpData, boolean z) {
        this.f136722n = signUpData;
        if (!m158256r0()) {
            m158329y1(3, z);
            return;
        }
        if (NullChecker.m82486a(this.f136722n.gender)) {
            zif0.f204509T.put(this.f136722n.gender.toString());
        } else {
            wyd0 wyd0Var = zif0.f204509T;
            if (!TextUtils.isEmpty(wyd0Var.get())) {
                this.f136722n.gender = Gender.get(wyd0Var.get());
            }
        }
        m158310n0();
        ((ref0) this.f119873b).m181013B1();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m158321u0(uxj0 uxj0Var) {
        this.f136724p.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u1 */
    public void m158322u1(String str) {
        if (!C16074bp.m105753h() || this.f136723o.get().booleanValue()) {
            bnl0.m105525M0(this.f136714f, false);
        } else {
            i4g0.m138492A("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", str));
            bnl0.m105525M0(this.f136714f, true);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m158323v0() {
        i4g0.m138520r("e_signup_complete", ((SignUpAiV2Act) this.f119872a).pageId());
        ((ref0) this.f119873b).m181013B1();
    }

    /* JADX INFO: renamed from: v1 */
    public void m158324v1(SignUpData signUpData, boolean z) {
        this.f136722n = signUpData;
        if (m158256r0()) {
            m158312o1(true);
        } else {
            m158329y1(2, z);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m158325w0(Boolean bool) {
        if (bool.booleanValue()) {
            bsj0.m106283s(this.f119872a, this.f136715g);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m158326w1(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        AccountModule.f16756c.m29329e2(calendar.getTimeInMillis());
        AccountModule.f16756c.m29325c2(i);
        ((ref0) this.f119873b).m139323H0(AccountTempApi.SignUpType.birthInfoSaved, new x20() { // from class: l.hgf0
            @Override // p153l.x20
            public final void call() {
                this.f109404a.m158296Z0();
            }
        }, new y20() { // from class: l.igf0
            @Override // p153l.y20
            public final void call(Object obj) {
                mgf0.m158252p((Throwable) obj);
            }
        });
        i4g0.m138523u("e_ai_signup_age", "p_ai_signup", jyb.m147494Y("user_age", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m158327x0() {
        m158326w1(20);
        bnl0.m105525M0(this.f136714f, false);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m158328y0(View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f119872a).pageId(), pf60.m172085a("skip_from_which", SeeTextDynamicParam.age));
        m158310n0();
        m158272F1("填写“年龄”方便为您匹配更合适的对象，若跳过则默认为“20岁”", "继续填写", SeeTextDynamicParam.age, new x20() { // from class: l.iff0
            @Override // p153l.x20
            public final void call() {
                mgf0.m158232W();
            }
        }, new x20() { // from class: l.jff0
            @Override // p153l.x20
            public final void call() {
                this.f120585a.m158327x0();
            }
        });
    }

    /* JADX INFO: renamed from: y1 */
    public void m158329y1(int i, boolean z) {
        this.f136717i.m4252j(i, z);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m158330z0() {
        m158271E1(2);
        ((ref0) this.f119873b).m181021u1();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m158331z1(Gender gender, final x20 x20Var) {
        ((ref0) this.f119873b).m181014E1(gender);
        ((ref0) this.f119873b).m139323H0(AccountTempApi.SignUpType.genderInfoSave, new x20() { // from class: l.pff0
            @Override // p153l.x20
            public final void call() {
                this.f152171a.m158297a1(x20Var);
            }
        }, new y20() { // from class: l.qff0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157299a.m158298d1((Throwable) obj);
            }
        });
        i4g0.m138523u("e_ai_signup_gender", "p_ai_signup", pf60.m172085a("ai_signup_gender", TEnum.equals(gender, "male") ? "male" : "female"));
    }

    /* JADX INFO: renamed from: l.mgf0$b */
    public class C18611b extends ViewPager2.AbstractC0742i {
        public C18611b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (mgf0.this.f136717i.getCurrentItem() != i || mgf0.this.f136731w == i) {
                return;
            }
            mgf0.this.m158308m0(i);
            mgf0.this.f136731w = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
        }
    }
}
