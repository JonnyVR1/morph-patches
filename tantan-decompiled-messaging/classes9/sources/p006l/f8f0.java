package p006l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiV2Act;
import com.p000p1.mobile.putong.account.p002ui.accountai.frag.SignUpAgeFrag;
import com.p000p1.mobile.putong.account.p002ui.accountai.frag.SignUpGenderFrag;
import com.p000p1.mobile.putong.account.p002ui.accountai.frag.SignUpNameFrag;
import com.p000p1.mobile.putong.account.p002ui.accountai.frag.SignUpPortraitFrag;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.StepSeekBar;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import l.bd50;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.gbl0;
import l.hpd0;
import l.i0e;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.uqd0;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.y6q0;
import l.yij0;
import l.zvf0;
import v.VButton_FakeShadow;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f8f0 extends c3f0<k6f0, SignUpAiV2Act> {

    /* JADX INFO: renamed from: x */
    public static String[] f12555x = {"诗沫涵", "凤浩然", "惜沫", "桃花仙", "命中赐", "泪染渍", "表情帝", "泪眼", "三年终", "丑丑阿", "陌心", "小灰鸡", "修静轩", "雪颖呐", "清泉谛", "孤星泪", "沈明轩", "苏以北", "天梭云影", "时光印记", "火云箭手", "溯雨潇潇", "天山童老", "贩甜少女", "空大女王", "独白炫霾", "惜醉颜", "夜灵霜影", "韩系女孩", "舞会女王", "坠落枯叶", "可乐可乐", "莎士小姐", "欢乐男孩", "为你歌唱", "幻墨烟", "瑶冰紫焉", "凉了夏天", "奇葩男友", "爱情纯真", "小马同学", "嫦娥水晶", "安汐子", "学酥很浅", "可忆的冷", "小暧昧", "通心境话", "奥拓", "枫叶晓寒", "小小塵埃", "妳在我安", "单身少女", "黑色忧郁", "独月夜", "岚芷幽嘉", "飘落无踪", "素颜如水", "深渊骑士", "听我笑吧", "加拉哈德", "心海扬波", "零落情话", "十字路口", "安康永乐", "动感帽饰", "吻眼吹沙", "不慌无恙", "笙歌未央", "场控帝王", "浅色青鸾", "创意小屋", "倾世璃歌", "久别珍重", "青蛙公主", "风林语嫣", "温柔无极", "浮华蜃楼", "战神美女", "持刀女将", "孤峰无伴", "聚宝坑", "微光壹夏", "如花似玉", "久居我心", "夕颜若雪", "酒馆打烊", "天蓝褶皱", "热情会冷", "秋天的童话", "舞所谓", "時光漫步", "眼眸印温柔", "喵一曲挽歌", "沫汐", "陌希", "青梅竹马意", "待故人归来", "温暖到最终", "仙女有翅膀", "海洋味红酒", "和幸福干杯", "演绎新秀", "耳边唱情歌", "挽风说笑", "卖梦商人", "花渐影", "小桃花", "做你中意人", "长醉不曾醒", "白日做梦", "狂风中相遇", "浇熄言语", "清风掳我心", "殊途同归", "逝爱", "小小的感动", "汐染季沫", "独步天下", "守足无措", "北幕", "南辞", "刻骨抵温柔", "自以为爱", "清秀如初", "梨花薰雨", "醉渺茫", "许我七日暖", "拿糖糖换", "当初的我们", "独领五尊", "南城荒芜", "卑微的借口", "刺猬的拥抱", "可爱的狗蛋", "纯黑纯白", "你好徐小姐", "仗着喜欢", "诊断你的心", "纯情大灰狼", "空城旧少年", "右手边的我", "璎花雪", "未清一份爱", "无力挽留谁", "只为你一人", "少女娃娃机", "虫儿飞", "雪花女孩", "午夜鹣鹣梦", "小班的小白", "看风景的人", "最温暖的墙", "会飞的鱼", "暮雨打梨花", "轻雨漫云峰", "演绎岁月", "幸福下载中", "烟花一瞬间", "箫声起泪决堤", "眼成海卻未藍", "折扇戏美人", "软妹型小仙女", "月下独酌求醉", "会飞的雨", "追忆的小青年", "歌一程酒一壶", "前奏後曲", "忘情水水上花", "未長大的幸福", "伤心戒伴抹星", "会飞的风", "余温散尽", "被退回的礼物", "送你辣条", "无止尽的温柔", "悲伤里的阳光", "柠檬味嘎嘣脆", "那美好的回忆", "会飞的蓝鸟", "会飞的猫", "结果措手不及", "仅有的唯一", "放飞的鹞子", "曾经海誓山盟", "来日不方长", "小傻瓜大笨蛋", "沒有颜色天空", "花落念伊人", "停滞在朝暮里", "苏暮奈", "歇斯底里德笑", "逛逛道人飞了", "蹲在墙头等你", "愿时光静好", "梦中人现红尘", "独特的乖乖", "嘴角的浅笑", "深海里的浅鱼", "爱在美丽神话", "谈理想说梦想", "谁卑微的承诺", "任凭年华老去", "麦是麦兜的麦", "一乐泯恩怨", "End落幕", "陪你到时光褪尽", "把我打包带走吧", "糖果味小仙儿", "马尾上的蝴蝶结", "致命旳夹竹桃", "猫与你不可缺一", "不分手的恋爱", "指间温暖奶茶店", "霸气震天你蒋爷", "主導愛的梅壹秒", "终极者夜舞馆", "腐烂的奈何桥", "卖女孩点火柴", "爱点火柴", "青风缠月浪碎银", "夜深人静的时分", "一缕繁华如似梦", "长的丑活的久", "只待佳人美红颜", "蓝色的云舞不乖", "影响天气的心情", "一生热爱不回头", "新的迷恋", "寒冷的冰", "能不能好好恋爱", "溺水三千不敌你", "命运说不出的伤", "我们仅此而已", "冷言冷语冷记忆", "烟雨楼", "泪是咸的", "爱上这座城", "好喝的清茶", "甜猫储存室", "养只狗叫橙子", "太平间公主", "小熊被偷走了", "今晚去捕目亮", "哒哒的铃铛", "来一份甜豆", "肥冉小朋友", "卷毛小桃子", "有个超人叫咸蛋", "来杯旺崽牛奶", "养猪仙", "昨日牧尘", "挽轻轻风", "余挽", "辞镜", "栀染", "陌笙", "甜美", "对的甜味", "囍笑", "阿葵", "栀蓝", "蓝莓奶昔", "念念康康", "爱听歌的鱼", "歪念", "阿璃", "孤魂", "心房", "千寻", "孤岛", "風光", "好香的小红花", "稳妥", "未亡", "长夜漫游", "鸯旧", "归隐", "甜恋", "痴人心", "桃花扇", "白云味棉花糖", "星辰与曦月", "初夏那抹浅蓝", "亦徒", "竹忆", "青染", "凊若", "鹿味仙", "末将姓", "书生敬山", "过尽千帆", "识汝不识丁", "南海菇凉", "千人憎", "顾我安稳", "甜柠檬", "素弦幽梦", "墨染幽篁", "浅吟流年", "青笺绘诗", "云岫逸客", "落梅听雨", "沐风吟月", "莲心素韵", "幽涧寻芳", "烟柳画桥", "碧霄云鹤", "素手挽清风", "墨韵凝香", "绮梦潇湘", "冷月葬花魂", "可爱俏皮喵", "糖果小萌主", "元气喵酱", "泡泡小熊", "甜豆吖", "俏皮桃桃", "萌兔叽", "星星糖宝", "奶凶小可爱", "布丁喵呜", "草莓卷卷", "糯糯小仙女", "萌面小侠", "松果萌萌", "彩虹泡泡糖", "甜心软糖", "乐乐爱文艺", "微光浅吟", "素年锦时", "浅岸听风", "森林与诗", "静听花语", "青柠时光", "悠云逸梦", "清风墨竹", "湖畔听琴", "晨露润心", "樱落素笺", "白茶与风", "琉璃浅梦", "听雪吟霜", "暖阳浅绘", "阳简约", "简逸", "酷盖阿星", "时尚潮咖", "摩登先锋", "简约风影", "冷调酷仔", "潮流前线", "极简格调", "都市风尚", "炫酷达人", "潮流教主", "简约逸客", "酷玩一族", "时尚捕手", "潮范先锋", "神秘的椰子", "暗夜幽影", "幻影谜踪", "幽秘星辰", "灵犀探秘", "迷雾幻心", "月影谜客", "深渊凝视", "幻夜幽光", "空灵幻梦", "星穹秘语", "幽谧使者", "玄影谜踪", "暗域灵犀", "紫幻幽梦", "逆空谜影", "励志的叶子", "逐梦之光", "奋进先锋", "拼搏少年郎", "逆袭王者", "梦想起航站", "励志小飞侠", "破茧成蝶者", "崛起之路", "热血逐风", "坚毅追梦人", "勇攀高峰者", "奋进青年派", "冲霄凌云志", "励志领航员", "糖果城堡主", "镭射酷仔", "幻影潮咖", "仙境萌友", "精灵梦旅人", "闪电的动漫人"};

    /* JADX INFO: renamed from: c */
    public VRelative f12556c;

    /* JADX INFO: renamed from: d */
    public StepSeekBar f12557d;

    /* JADX INFO: renamed from: e */
    public VImage f12558e;

    /* JADX INFO: renamed from: f */
    public VText f12559f;

    /* JADX INFO: renamed from: g */
    public VScroll f12560g;

    /* JADX INFO: renamed from: h */
    public VLinear f12561h;

    /* JADX INFO: renamed from: i */
    public ViewPager2 f12562i;

    /* JADX INFO: renamed from: j */
    public VButton_FakeShadow f12563j;

    /* JADX INFO: renamed from: k */
    public View f12564k;

    /* JADX INFO: renamed from: l */
    public final List<Frag> f12565l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<Animator> f12566m;

    /* JADX INFO: renamed from: n */
    public SignUpData f12567n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final hpd0 f12568o;

    /* JADX INFO: renamed from: p */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final hpd0 f12569p;

    /* JADX INFO: renamed from: q */
    public String f12570q;

    /* JADX INFO: renamed from: r */
    public SignUpGenderFrag f12571r;

    /* JADX INFO: renamed from: s */
    public SignUpAgeFrag f12572s;

    /* JADX INFO: renamed from: t */
    public SignUpNameFrag f12573t;

    /* JADX INFO: renamed from: u */
    public SignUpPortraitFrag f12574u;

    /* JADX INFO: renamed from: v */
    public final C0708b f12575v;

    /* JADX INFO: renamed from: w */
    public int f12576w;

    /* JADX INFO: renamed from: l.f8f0$a */
    public class DialogInterfaceOnDismissListenerC0707a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f12577a;

        public DialogInterfaceOnDismissListenerC0707a(cwf0 cwf0Var) {
            this.f12577a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f12577a);
        }
    }

    public f8f0(@NonNull SignUpAiV2Act signUpAiV2Act) {
        super(signUpAiV2Act);
        this.f12565l = new ArrayList();
        this.f12566m = new ArrayList<>();
        String str = "has_jump_" + AccountModule.m26F().userId();
        Boolean bool = Boolean.FALSE;
        this.f12568o = new hpd0(str, bool);
        this.f12569p = new hpd0("has_submit_jump_" + AccountModule.m26F().userId(), bool);
        this.f12570q = "肥冉小朋友";
        this.f12575v = new C0708b();
        this.f12576w = -1;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ y6q0 m15111K(View view, y6q0 y6q0Var) {
        view.setPadding(0, 0, 0, y6q0Var.i());
        return y6q0Var;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m15114N(Throwable th) {
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m15119S() {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m15123W() {
    }

    /* JADX INFO: renamed from: o0 */
    public static String m15142o0(int i) {
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
    public static /* synthetic */ void m15143p(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static String m15144p0(SignUpData signUpData) {
        int iMin = Math.min(f12555x.length, new Random().nextInt(f12555x.length));
        StringBuilder sb = new StringBuilder();
        sb.append(f12555x[iMin]);
        sb.append(m15142o0(4));
        sb.append((signUpData == null || !TEnum.equals(signUpData.gender, "female")) ? "m" : "f");
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m15145q() {
    }

    /* JADX INFO: renamed from: r */
    private void m15146r() {
        m13096e(this.f12556c);
        m15205q0();
        this.f12562i.setAdapter(new n5f0(((SignUpAiV2Act) this.f9323a).getSupportFragmentManager(), ((SignUpAiV2Act) this.f9323a).getLifecycle(), this.f12565l));
        this.f12562i.g(this.f12575v);
        this.f12562i.setUserInputEnabled(false);
        gbl0.y0(this.f12560g, new bd50() { // from class: l.l6f0
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return f8f0.m15111K(view, y6q0Var);
            }
        });
        this.f12557d.setMax(4);
        this.f12557d.setProgress(1);
        this.f12557d.setTouchEnable(false);
        ((k6f0) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f12564k)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.w6f0
            public final void call(Object obj) {
                this.f25010a.m15216w0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m15147r0() {
        String str = (String) eje.m14574h().f11187c.get();
        return TextUtils.equals("goto_lie_tavern", str) || TextUtils.equals("goto_business_chatroom", str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m15149u(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m15150v(View view, ViewPager2 viewPager2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = view.getMeasuredHeight();
            viewPager2.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m15155A0() {
        e51.H(mo13092C0(), new Runnable() { // from class: l.u7f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23423a.m15221z0();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m15156A1() {
        if (C0775gp.m15901h()) {
            this.f12568o.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m15157B0(d30 d30Var, Gender gender) {
        m15156A1();
        m15213u1("");
        m15222z1(gender, d30Var);
        ((k6f0) this.f9324b).m12508O0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m15158B1() {
        if (C0775gp.m15901h()) {
            xdl0.M0(this.f12559f, false);
        }
    }

    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public final void m15172K0(String str, c4g0 c4g0Var, d30 d30Var) {
        AccountModule.f26c.m234j2(str);
        m15171J1(c4g0Var, d30Var, str);
        zvf0.r("e_ai_signup_name", "p_ai_signup");
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m15160D0(d30 d30Var) {
        m15156A1();
        m15213u1("");
        m15222z1(Gender.get("male"), d30Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m15161E0(d30 d30Var) {
        xdl0.M0(this.f12559f, false);
        m15222z1(Gender.get("female"), d30Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E1 */
    public void m15162E1(int i) {
        if (i < 1) {
            return;
        }
        if (m15147r0()) {
            i = Math.min(2, i);
        }
        this.f12557d.setProgress(i, true);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: F1 */
    public final void m15163F1(String str, String str2, final String str3, final d30 d30Var, final d30 d30Var2) {
        final String str4;
        if ("gender".equals(str3)) {
            str4 = "p_ai_signup_gender_skip_pop";
        } else if ("age".equals(str3)) {
            str4 = "p_ai_signup_age_skip_pop";
        } else if ("name".equals(str3)) {
            str4 = "p_ai_signup_name_skip_pop";
        } else {
            str4 = "photo".equals(str3) ? "p_ai_signup_photo_skip_pop" : "";
        }
        cwf0 cwf0VarC = i0e.c(str4, Dialog.class.getName());
        xh0.a aVarC = new xh0.a((Context) this.f9323a).j(str).r(str2).f("仍要跳过").g(false).m(new DialogInterfaceOnDismissListenerC0707a(cwf0VarC)).h(false).o(new View.OnClickListener() { // from class: l.x7f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27379a.m15190e1(str4, str3, d30Var, view);
            }
        }).c(new View.OnClickListener() { // from class: l.y7f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28064a.m15191f1(str4, str3, d30Var2, view);
            }
        });
        i0e.f(cwf0VarC);
        aVarC.a().g();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m15164G0(final d30 d30Var, View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "gender")});
        m15201n0();
        m15163F1("系统默认您为“女性”方便为您精准匹配用户，性别更改机会只有一次", "我是男生", "gender", new d30() { // from class: l.d7f0
            public final void call() {
                this.f10052a.m15160D0(d30Var);
            }
        }, new d30() { // from class: l.e7f0
            public final void call() {
                this.f10834a.m15161E0(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: G1 */
    public final void m15165G1(String str, String str2, boolean z) {
        if ("gender".equals(str2)) {
            zvf0.u("e_ai_signup_gender_skip_pop_again", str, new j760[]{j760.a("skip_gender", z ? "choose_male" : "skip")});
            return;
        }
        if ("age".equals(str2)) {
            zvf0.u("e_ai_signup_age_skip_pop_again", str, new j760[]{j760.a("skip_pop_age", z ? "fill_out" : "skip")});
        } else if ("name".equals(str2)) {
            zvf0.u("e_ai_signup_name_skip_pop_again", str, new j760[]{j760.a("skip_pop_name", z ? "fill_out" : "skip")});
        } else if ("photo".equals(str2)) {
            zvf0.u("e_ai_signup_photo_skip_pop_again", str, new j760[]{j760.a("skip_pop_photo", z ? "fill_out" : "skip")});
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m15166H0(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SignUpNameFrag signUpNameFrag = this.f12573t;
        if (zBooleanValue) {
            signUpNameFrag.m322J4(this.f9323a);
        } else {
            signUpNameFrag.m318D4();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m15167H1(boolean z) {
        this.f12563j.setClickable(z);
        VButton_FakeShadow vButton_FakeShadow = this.f12563j;
        if (z) {
            vButton_FakeShadow.setBackgroundResource(v2c0.f23976L1);
        } else {
            vButton_FakeShadow.setBackgroundResource(v2c0.f24078u1);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m15168I0() {
        if (NullChecker.a(act())) {
            act().hideInput(this.f12564k);
            m15162E1(4);
            ((k6f0) this.f9324b).m17976u1();
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m15169I1(final View view, final ViewPager2 viewPager2) {
        if (NullChecker.a(view)) {
            view.post(new Runnable() { // from class: l.t6f0
                @Override // java.lang.Runnable
                public final void run() {
                    f8f0.m15150v(view, viewPager2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m15170J0() {
        e51.H(mo13092C0(), new Runnable() { // from class: l.k7f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15645a.m15168I0();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m15171J1(final c4g0 c4g0Var, final d30 d30Var, String str) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("login");
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "nikeName";
        detectTextNew_.value = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        ((k6f0) this.f9324b).m12509P0(detectRequestNew_, null, AccountTempApi.SignUpType.nameInfoSaved, new d30() { // from class: l.l7f0
            public final void call() {
                this.f16257a.m15192g1(d30Var, c4g0Var);
            }
        }, new e30() { // from class: l.m7f0
            public final void call(Object obj) {
                this.f16839a.m15193h1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m15173L0(Boolean bool) {
        m15167H1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m15174M0(View view) {
        zvf0.r("e_ai_signup_chage_name_button", ((SignUpAiV2Act) this.f9323a).pageId());
        m15202n1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m15175N0() {
        this.f12573t.m320F4(C0907jy.m17845o0((String) AccountModule.f26c.m185I2().get()));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m15176O0(c4g0 c4g0Var, d30 d30Var) {
        xdl0.M0(this.f12559f, false);
        m15172K0(!TextUtils.isEmpty(this.f12573t.m319E4()) ? this.f12573t.m319E4() : this.f12570q, c4g0Var, d30Var);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m15177P0(final c4g0 c4g0Var, final d30 d30Var, View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "name")});
        m15201n0();
        m15163F1("填写“昵称”方便别人更快记住你，若仍要跳过，系统将随机展示昵称，您可进入后自行更改", "继续填写", "name", new d30() { // from class: l.o7f0
            public final void call() {
                f8f0.m15119S();
            }
        }, new d30() { // from class: l.p7f0
            public final void call() {
                this.f18621a.m15176O0(c4g0Var, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m15178Q0() {
        ((k6f0) this.f9324b).m17970f1(false, TextUtils.equals("DouyinTantan01", mr4.m19499b()));
        zvf0.r("e_ai_signup_photo", "p_ai_signup");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m15179R0() {
        ((k6f0) this.f9324b).m17968B1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m15180S0(View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "photo")});
        m15201n0();
        m15163F1("跳过将会影响您进入后匹配用户的体验", "继续上传", "photo", new d30() { // from class: l.f7f0
            public final void call() {
                f8f0.m15145q();
            }
        }, new d30() { // from class: l.g7f0
            public final void call() {
                this.f13102a.m15179R0();
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m15181T0() {
        this.f12560g.fullScroll(130);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m15182U0() {
        ((k6f0) this.f9324b).m17976u1();
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m15183V0(RegisterNameEnvelope registerNameEnvelope) {
        if (NullChecker.a(registerNameEnvelope) && NullChecker.a(registerNameEnvelope.data) && !TextUtils.isEmpty(registerNameEnvelope.data.name)) {
            String str = registerNameEnvelope.data.name;
            this.f12570q = str;
            this.f12573t.m320F4(C0907jy.m17845o0(str));
            m15167H1(!TextUtils.isEmpty(this.f12573t.m319E4()));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m15184W0(View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "photo")});
        m15201n0();
        ((k6f0) this.f9324b).m17968B1();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m15185X0() {
        zvf0.r("e_signup_complete", ((SignUpAiV2Act) this.f9323a).pageId());
        ((k6f0) this.f9324b).m17968B1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m15186Y0() {
        m15162E1(3);
        ((k6f0) this.f9324b).m17976u1();
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m15187Z0() {
        m15158B1();
        e51.H(mo13092C0(), new Runnable() { // from class: l.n7f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17524a.m15186Y0();
            }
        }, 200L);
        zvf0.x("e_ai_signup_birthday_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m15188a1(d30 d30Var) {
        m15158B1();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        zvf0.x("e_ai_signup_gender_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m15189d1(Throwable th) {
        this.f12571r.m308B4();
    }

    @Override // p006l.c3f0
    public void destroy() {
        super.destroy();
        int i = 0;
        while (true) {
            int size = this.f12566m.size();
            ArrayList<Animator> arrayList = this.f12566m;
            if (i >= size) {
                arrayList.clear();
                this.f12562i.n(this.f12575v);
                return;
            } else {
                if (NullChecker.a(arrayList.get(i)) && this.f12566m.get(i).isRunning()) {
                    this.f12566m.get(i).cancel();
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m15190e1(String str, String str2, d30 d30Var, View view) {
        m15165G1(str, str2, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m15191f1(String str, String str2, d30 d30Var, View view) {
        m15165G1(str, str2, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m15192g1(d30 d30Var, c4g0 c4g0Var) {
        m15158B1();
        d30Var.call();
        mkd0.z(c4g0Var);
        zvf0.x("e_ai_signup_name_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m15193h1(Throwable th) {
        m15197l0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f12564k = m15195k0(layoutInflater, viewGroup);
        m15146r();
        return this.f12564k;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m15194j1() {
        this.f12572s.m300C4(this.f12567n);
        m15207r1();
        m15213u1("age");
        zvf0.x("e_ai_signup_age", "p_ai_signup");
        xdl0.E0(this.f12559f, new View.OnClickListener() { // from class: l.u6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23378a.m15219y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public View m15195k0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g8f0.m15627b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k1 */
    public void m15196k1() {
        m15207r1();
        m15213u1("gender");
        zvf0.x("e_ai_signup_gender", "p_ai_signup");
        final d30 d30Var = new d30() { // from class: l.q6f0
            public final void call() {
                this.f19647a.m15155A0();
            }
        };
        this.f12571r.m310G4(new e30() { // from class: l.r6f0
            public final void call(Object obj) {
                this.f20387a.m15157B0(d30Var, (Gender) obj);
            }
        });
        xdl0.E0(this.f12559f, new View.OnClickListener() { // from class: l.s6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21125a.m15164G0(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m15197l0() {
        m15167H1(true);
        this.f12573t.m316B4();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m15198l1() {
        m15207r1();
        m15167H1(!TextUtils.isEmpty(this.f12573t.m319E4()));
        final c4g0 c4g0VarSubscribe = ((k6f0) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f12564k)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.c8f0
            public final void call(Object obj) {
                this.f9494a.m15166H0((Boolean) obj);
            }
        }));
        final d30 d30Var = new d30() { // from class: l.d8f0
            public final void call() {
                this.f10063a.m15170J0();
            }
        };
        this.f12573t.m324L4(new e30() { // from class: l.e8f0
            public final void call(Object obj) {
                this.f10843a.m15172K0(c4g0VarSubscribe, d30Var, (String) obj);
            }
        }, new e30() { // from class: l.m6f0
            public final void call(Object obj) {
                this.f16814a.m15173L0((Boolean) obj);
            }
        });
        this.f12573t.m322J4(this.f9323a);
        if (C0775gp.m15901h()) {
            m15213u1("name");
        }
        this.f12573t.m323K4(C0775gp.m15901h(), new View.OnClickListener() { // from class: l.n6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17509a.m15174M0(view);
            }
        });
        if (!TextUtils.isEmpty((CharSequence) AccountModule.f26c.m185I2().get())) {
            e51.G(new Runnable() { // from class: l.o6f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18033a.m15175N0();
                }
            });
        } else if (C0775gp.m15901h()) {
            m15202n1();
        }
        zvf0.x("e_ai_signup_name", "p_ai_signup");
        xdl0.E0(this.f12559f, new View.OnClickListener() { // from class: l.p6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18611a.m15177P0(c4g0VarSubscribe, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m15199m0(int i) {
        m15169I1(this.f12565l.get(i).getView(), this.f12562i);
        xdl0.E0(this.f12563j, (View.OnClickListener) null);
        if (i == 0) {
            xdl0.M(this.f12563j, false);
            m15196k1();
            return;
        }
        if (i == 1) {
            xdl0.M(this.f12563j, true);
            m15167H1(true);
            xdl0.E0(this.f12563j, new View.OnClickListener() { // from class: l.h7f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13738a.m15208s0(view);
                }
            });
            m15194j1();
            return;
        }
        if (i == 2) {
            xdl0.M(this.f12563j, true);
            xdl0.E0(this.f12563j, new View.OnClickListener() { // from class: l.s7f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21131a.m15210t0(view);
                }
            });
            m15198l1();
        } else {
            if (i != 3) {
                return;
            }
            xdl0.M(this.f12563j, false);
            m15200m1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m15200m1() {
        m15207r1();
        if (NullChecker.a(this.f12567n.gender)) {
            saf0.f21175T.put(this.f12567n.gender.toString());
        } else {
            uqd0 uqd0Var = saf0.f21175T;
            if (!TextUtils.isEmpty((CharSequence) uqd0Var.get())) {
                this.f12567n.gender = Gender.get((String) uqd0Var.get());
            }
        }
        this.f12574u.m334D4(this.f12567n.gender);
        this.f12574u.m333C4(new d30() { // from class: l.v6f0
            public final void call() {
                this.f24168a.m15178Q0();
            }
        });
        if (C0775gp.m15901h()) {
            xdl0.M0(this.f12559f, true);
            zvf0.A("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "photo")});
        }
        zvf0.x("e_ai_signup_photo_template", "p_ai_signup");
        zvf0.x("e_ai_signup_photo", "p_ai_signup");
        xdl0.E0(this.f12559f, new View.OnClickListener() { // from class: l.x6f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27374a.m15180S0(view);
            }
        });
        this.f12560g.postDelayed(new Runnable() { // from class: l.y6f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28061a.m15181T0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m15201n0() {
        if (((Boolean) this.f12569p.get()).booleanValue()) {
            return;
        }
        ((SignUpAiV2Act) this.f9323a).duringCreated(AccountModule.f26c.m251s2()).subscribe(mkd0.H(new e30() { // from class: l.z6f0
            public final void call(Object obj) {
                this.f28659a.m15212u0((roj0) obj);
            }
        }, new e30() { // from class: l.a7f0
            public final void call(Object obj) {
                f8f0.m15149u((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n1 */
    public final void m15202n1() {
        m15203o1(false);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m15203o1(boolean z) {
        if (!z) {
            ((SignUpAiV2Act) this.f9323a).duringCreated(AccountModule.f26c.m216a1()).subscribe(mkd0.H(new e30() { // from class: l.r7f0
                public final void call(Object obj) {
                    this.f20396a.m15183V0((RegisterNameEnvelope) obj);
                }
            }, new e30() { // from class: l.t7f0
                public final void call(Object obj) {
                    f8f0.m15114N((Throwable) obj);
                }
            }));
            return;
        }
        String strM15144p0 = m15144p0(this.f12567n);
        this.f12570q = strM15144p0;
        this.f12573t.m320F4(C0907jy.m17845o0(strM15144p0));
        m15172K0(strM15144p0, null, new d30() { // from class: l.q7f0
            public final void call() {
                this.f19659a.m15182U0();
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public void m15204p1(SignUpData signUpData, boolean z) {
        this.f12567n = signUpData;
        m15220y1(1, z);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m15205q0() {
        SignUpGenderFrag signUpGenderFragM305F4 = SignUpGenderFrag.m305F4();
        this.f12571r = signUpGenderFragM305F4;
        this.f12565l.add(signUpGenderFragM305F4);
        SignUpAgeFrag signUpAgeFragM296B4 = SignUpAgeFrag.m296B4();
        this.f12572s = signUpAgeFragM296B4;
        this.f12565l.add(signUpAgeFragM296B4);
        SignUpNameFrag signUpNameFragM313I4 = SignUpNameFrag.m313I4();
        this.f12573t = signUpNameFragM313I4;
        this.f12565l.add(signUpNameFragM313I4);
        SignUpPortraitFrag signUpPortraitFragM330B4 = SignUpPortraitFrag.m330B4();
        this.f12574u = signUpPortraitFragM330B4;
        this.f12565l.add(signUpPortraitFragM330B4);
        this.f12574u.m333C4(new d30() { // from class: l.z7f0
            public final void call() {
                this.f28665a.m15214v0();
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m15206q1() {
        xdl0.M0(this.f12559f, true);
        xdl0.E0(this.f12559f, new View.OnClickListener() { // from class: l.v7f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24207a.m15184W0(view);
            }
        });
        if (C0775gp.m15900g()) {
            zvf0.x("e_signup_complete", ((SignUpAiV2Act) this.f9323a).pageId());
            this.f12574u.m333C4(new d30() { // from class: l.w7f0
                public final void call() {
                    this.f25019a.m15185X0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m15207r1() {
        C0811hp.m16308h();
        xdl0.M0(this.f12558e, false);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m15208s0(View view) {
        zvf0.v("e_ai_signup_age", "p_ai_signup", new j760[0]);
        m15156A1();
        m15213u1("");
        m15217w1(this.f12572s.m299A4());
    }

    /* JADX INFO: renamed from: s1 */
    public void m15209s1(boolean z) {
        ((k6f0) this.f9324b).m12508O0();
        m15220y1(0, z);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m15210t0(View view) {
        this.f12573t.m317C4();
        m15167H1(!TextUtils.isEmpty(this.f12573t.m319E4()));
    }

    /* JADX INFO: renamed from: t1 */
    public void m15211t1(SignUpData signUpData, boolean z) {
        this.f12567n = signUpData;
        if (!m15147r0()) {
            m15220y1(3, z);
            return;
        }
        if (NullChecker.a(this.f12567n.gender)) {
            saf0.f21175T.put(this.f12567n.gender.toString());
        } else {
            uqd0 uqd0Var = saf0.f21175T;
            if (!TextUtils.isEmpty((CharSequence) uqd0Var.get())) {
                this.f12567n.gender = Gender.get((String) uqd0Var.get());
            }
        }
        m15201n0();
        ((k6f0) this.f9324b).m17968B1();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m15212u0(roj0 roj0Var) {
        this.f12569p.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u1 */
    public void m15213u1(String str) {
        if (!C0775gp.m15901h() || ((Boolean) this.f12568o.get()).booleanValue()) {
            xdl0.M0(this.f12559f, false);
        } else {
            zvf0.A("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", str)});
            xdl0.M0(this.f12559f, true);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m15214v0() {
        zvf0.r("e_signup_complete", ((SignUpAiV2Act) this.f9323a).pageId());
        ((k6f0) this.f9324b).m17968B1();
    }

    /* JADX INFO: renamed from: v1 */
    public void m15215v1(SignUpData signUpData, boolean z) {
        this.f12567n = signUpData;
        if (m15147r0()) {
            m15203o1(true);
        } else {
            m15220y1(2, z);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m15216w0(Boolean bool) {
        if (bool.booleanValue()) {
            yij0.s(this.f9323a, this.f12560g);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m15217w1(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        AccountModule.f26c.m225e2(calendar.getTimeInMillis());
        AccountModule.f26c.m221c2(i);
        ((k6f0) this.f9324b).m12503H0(AccountTempApi.SignUpType.birthInfoSaved, new d30() { // from class: l.a8f0
            public final void call() {
                this.f8160a.m15187Z0();
            }
        }, new e30() { // from class: l.b8f0
            public final void call(Object obj) {
                f8f0.m15143p((Throwable) obj);
            }
        });
        zvf0.u("e_ai_signup_age", "p_ai_signup", new j760[]{vwb.Y("user_age", Integer.valueOf(i))});
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m15218x0() {
        m15217w1(20);
        xdl0.M0(this.f12559f, false);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m15219y0(View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiV2Act) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "age")});
        m15201n0();
        m15163F1("填写“年龄”方便为您匹配更合适的对象，若跳过则默认为“20岁”", "继续填写", "age", new d30() { // from class: l.b7f0
            public final void call() {
                f8f0.m15123W();
            }
        }, new d30() { // from class: l.c7f0
            public final void call() {
                this.f9474a.m15218x0();
            }
        });
    }

    /* JADX INFO: renamed from: y1 */
    public void m15220y1(int i, boolean z) {
        this.f12562i.j(i, z);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m15221z0() {
        m15162E1(2);
        ((k6f0) this.f9324b).m17976u1();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m15222z1(Gender gender, final d30 d30Var) {
        ((k6f0) this.f9324b).m17969E1(gender);
        ((k6f0) this.f9324b).m12503H0(AccountTempApi.SignUpType.genderInfoSave, new d30() { // from class: l.i7f0
            public final void call() {
                this.f14293a.m15188a1(d30Var);
            }
        }, new e30() { // from class: l.j7f0
            public final void call(Object obj) {
                this.f15049a.m15189d1((Throwable) obj);
            }
        });
        zvf0.u("e_ai_signup_gender", "p_ai_signup", new j760[]{j760.a("ai_signup_gender", TEnum.equals(gender, "male") ? "male" : "female")});
    }

    /* JADX INFO: renamed from: l.f8f0$b */
    public class C0708b extends ViewPager2.i {
        public C0708b() {
        }

        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
        }

        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (f8f0.this.f12562i.getCurrentItem() != i || f8f0.this.f12576w == i) {
                return;
            }
            f8f0.this.m15199m0(i);
            f8f0.this.f12576w = i;
        }

        public void onPageSelected(int i) {
        }
    }
}
