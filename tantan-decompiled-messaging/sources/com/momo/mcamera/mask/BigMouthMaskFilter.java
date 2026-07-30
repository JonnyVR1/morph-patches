package com.momo.mcamera.mask;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p149l.AbstractC17477i4;
import p149l.etf;
import p149l.lgm;
import p149l.mcj;
import p149l.pjw;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes7.dex */
public class BigMouthMaskFilter extends AbstractC17477i4 implements etf {
    private static final int POINTS_LENGTH = 96;
    private int landMaskHandle;
    private List<PointF> locationList = new ArrayList(26);
    private String maskImagePath;
    private int maskTexture;
    private int maskTextureHandle;
    private int matrixLocation1;
    private int matrixLocation2;
    private int matrixLocation3;
    private pjw mmcvInfo;
    private int texSizeHandle;

    public BigMouthMaskFilter() {
        for (int i = 0; i < 26; i++) {
            this.locationList.add(new PointF());
        }
    }

    private void deleteTexture() {
        int i = this.maskTexture;
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.maskTexture = 0;
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        deleteTexture();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\n\nuniform vec2 texSize;\nuniform float isLandMask;\n\nuniform mat4 matrixOne;\nuniform mat4 matrixTwo;\nuniform mat4 matrixThree;\n\n#define p2  vec2(0.109322,0.090341)\n#define p4  vec2(0.141959,0.406709)\n#define p6  vec2(0.167116,0.519916)\n#define p8  vec2(0.194969,0.633124)\n#define p10 vec2(0.243486,0.734801)\n#define p12 vec2(0.311770,0.820755)\n#define p14 vec2(0.389039,0.887841)\n#define p16 vec2(0.484277,0.918239)\n#define p18 vec2(0.582210,0.894130)\n#define p20 vec2(0.670261,0.833333)\n#define p22 vec2(0.743935,0.755765)\n#define p24 vec2(0.798742,0.656184)\n#define p26 vec2(0.831986,0.541929)\n#define p28 vec2(0.850854,0.423480)\n#define p30 vec2(0.867925,0.308176)\n#define p43 vec2(0.495957,0.209476)\n#define p46 vec2(0.495957,0.420000)\n#define p44 vec2(0.495957,0.284382)\n#define p45 vec2(0.495957,0.369287)\n\n#define x_a 1.0\n#define y_a 1.0\n\nstruct Triangle{\n    vec2 A;\n    vec2 B;\n    vec2 C;\n};\n\nfloat judgePointInTriangleOrNot(vec2 curPoint,Triangle curTriangle) {\n    vec2 A = curTriangle.A;\n    vec2 B = curTriangle.B;\n    vec2 C = curTriangle.C;\n\n    vec2 v0 = C - A ;\n    vec2 v1 = B - A ;\n    vec2 v2 = curPoint - A ;\n\n    float dot00 = dot(v0,v0) ;\n    float dot01 = dot(v0,v1) ;\n    float dot02 = dot(v0,v2) ;\n    float dot11 = dot(v1,v1) ;\n    float dot12 = dot(v1,v2) ;\n\n    float inverDeno = 1.0 / (dot00 * dot11 - dot01 * dot01) ;\n\n    float u = (dot11 * dot02 - dot01 * dot12) * inverDeno ;\n    float v = (dot00 * dot12 - dot01 * dot02) * inverDeno ;\n\n    float condition ;\n    if((u>=0.0&&u<=1.0)&&(v>=0.0&&v<=1.0)&&(u+v<=1.0))\n        condition=1.0;\n    else\n        condition=0.0;\n\n    return condition;\n}\n\nvec2 triangleTransform(vec2 curPoint,Triangle dstTriangle,Triangle srcTriangle) {\n    vec2 A = dstTriangle.A;\n    vec2 B = dstTriangle.B;\n    vec2 C = dstTriangle.C;\n\n    vec2 a = srcTriangle.A;\n    vec2 b = srcTriangle.B;\n    vec2 c = srcTriangle.C;\n\n    vec2 AP = curPoint - A;\n    vec2 BC = C - B;\n\n    float apxy = AP.x/AP.y;\n    float bcyx = BC.y/BC.x;\n\n    vec2 D = vec2(0.0);\n    D.y = apxy*bcyx;\n    D.x = B.y*apxy - A.y*apxy - B.x*D.y + A.x;\n    D.x /= 1.0 - D.y;\n    D.y = D.x*bcyx - B.x*bcyx + B.y;\n\n    apxy = length(D - B)/length(BC);\n    bcyx = length(AP)/length(D - A);\n\n    D = b + (c-b)*apxy;\n    D = a + (D-a)*bcyx;\n    return D;\n}\n\nvec2 faceStretch(vec2 textureCoord, vec2 originPosition, vec2 targetPosition, float radius, float curve) {\n    vec2 direction = targetPosition - originPosition;\n    float lengthA = length(direction);\n    if(lengthA<0.0001)   return direction;\n    float lengthB = min(lengthA, radius);\n    direction *= lengthB / lengthA;\n    float infect = distance(textureCoord, originPosition)/radius;\n    infect = clamp(1.0-infect,0.0,1.0);\n    infect = pow(infect, curve);\n\n    return direction * infect;\n}\n\nvec2 stretchFun(vec2 textureCoord, vec2 originPosition, vec2 targetPosition, float radius) {\n    vec2 offset = vec2(0.0);\n    vec2 result = vec2(0.0);\n\n    vec2 direction = targetPosition - originPosition;\n    float lengthA = length(direction);\n\n    float infect = distance(textureCoord, originPosition)/radius;\n\n    infect = 1.0-infect;\n    infect = clamp(infect,0.0,1.0);\n    offset = direction * infect;\n\n    result = textureCoord - offset;\n\n    return result;\n}\n\nvec2 enlargeFun(vec2 curCoord,vec2 circleCenter,float radius,float intensity) {\n    float currentDistance = distance(curCoord,circleCenter);\n        {\n            float weight = currentDistance/radius;\n            weight = 1.0-intensity*(1.0-weight*weight);\n            weight = clamp(weight,0.0,1.0);\n            curCoord = circleCenter+(curCoord-circleCenter)*weight;\n        }\n    return curCoord;\n}\n\nvec2 narrowFun(vec2 curCoord,vec2 circleCenter,float radius,float intensity) {\n    float currentDistance = distance(curCoord,circleCenter);\n        {\n            float weight = currentDistance/radius;\n            weight = 1.0-intensity*(1.0-weight*weight);\n            weight = clamp(weight,0.0001,1.0);\n            curCoord = circleCenter+(curCoord-circleCenter)/weight;\n        }\n    return curCoord;\n}\n\nvoid main() {\n    vec4 originColor = texture2D(inputImageTexture, textureCoordinate);\n    gl_FragColor = originColor;\n\n    if(isLandMask < 0.5)\n        return;\n\n    vec2 pos2   = vec2(matrixOne[0][0],matrixOne[0][1]);\n    vec2 pos4   = vec2(matrixOne[0][2],matrixOne[0][3]);\n    vec2 pos6   = vec2(matrixOne[1][0],matrixOne[1][1]);\n    vec2 pos8   = vec2(matrixOne[1][2],matrixOne[1][3]);\n    vec2 pos10  = vec2(matrixOne[2][0],matrixOne[2][1]);\n    vec2 pos12  = vec2(matrixOne[2][2],matrixOne[2][3]);\n    vec2 pos14  = vec2(matrixOne[3][0],matrixOne[3][1]);\n    vec2 pos16  = vec2(matrixOne[3][2],matrixOne[3][3]);\n\n\n    vec2 pos18   = vec2(matrixTwo[0][0],matrixTwo[0][1]);\n    vec2 pos20   = vec2(matrixTwo[0][2],matrixTwo[0][3]);\n    vec2 pos22   = vec2(matrixTwo[1][0],matrixTwo[1][1]);\n    vec2 pos24   = vec2(matrixTwo[1][2],matrixTwo[1][3]);\n    vec2 pos26  = vec2(matrixTwo[2][0],matrixTwo[2][1]);\n    vec2 pos28  = vec2(matrixTwo[2][2],matrixTwo[2][3]);\n    vec2 pos30  = vec2(matrixTwo[3][0],matrixTwo[3][1]);\n    vec2 pos43  = vec2(matrixTwo[3][2],matrixTwo[3][3]);\n\n\n    vec2 pos44   = vec2(matrixThree[0][0],matrixThree[0][1]);\n    vec2 pos45   = vec2(matrixThree[0][2],matrixThree[0][3]);\n    vec2 pos46   = vec2(matrixThree[1][0],matrixThree[1][1]);\n    vec2 pos87   = vec2(matrixThree[1][2],matrixThree[1][3]);\n    vec2 pos98  = vec2(matrixThree[2][0],matrixThree[2][1]);\n    vec2 pos102  = vec2(matrixThree[2][2],matrixThree[2][3]);\n\n    float surfaceWidth = texSize.x;\n    float surfaceHeight = texSize.y;\n\n    if(pos46.x>0.03 || pos46.y>0.03)\n    {\n        vec2 sampleCoordinate   = vec2(0.0);\n        vec4 sampleColor        = vec4(0.0);\n        if(length((pos43-pos16)*403.0/638.0)>distance(pos16,pos46))\n        {\n            pos44 = pos16+(pos43-pos16)*560.0/638.0;\n            pos45 = pos16+(pos43-pos16)*480.0/638.0;\n            pos46 = pos16+(pos43-pos16)*403.0/638.0;\n        }\n\n        float scale = 0.68;\n        vec2 curPoint = textureCoordinate;\n        //shader 被iOS改过，坐标跟我们是反的\n        curPoint.y = 1. - curPoint.y;\n        vec2 mouthCenter = (pos98+pos102)*0.5-(pos16-pos46)*0.5;\n        vec2 center = pos46;\n        vec2 vMove = (pos46-pos87)*0.825;\n\n        Triangle dstTriangle = Triangle(pos2,pos4,pos46);\n        Triangle srcTriangle = Triangle(p2,p4,p46);\n        float condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos4,pos6,pos46);\n        srcTriangle = Triangle(p4,p6,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos6,pos8,pos46);\n        srcTriangle = Triangle(p6,p8,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos8,pos10,pos46);\n        srcTriangle = Triangle(p8,p10,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos10,pos12,pos46);\n        srcTriangle = Triangle(p10,p12,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos12,pos14,pos46);\n        srcTriangle = Triangle(p12,p14,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {                        sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos14,pos16,pos46);\n        srcTriangle = Triangle(p14,p16,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos16,pos18,pos46);\n        srcTriangle = Triangle(p16,p18,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos18,pos20,pos46);\n        srcTriangle = Triangle(p18,p20,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos20,pos22,pos46);\n        srcTriangle = Triangle(p20,p22,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos22,pos24,pos46);\n        srcTriangle = Triangle(p22,p24,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos24,pos26,pos46);\n        srcTriangle = Triangle(p24,p26,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos26,pos28,pos46);\n        srcTriangle = Triangle(p26,p28,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos28,pos30,pos46);\n        srcTriangle = Triangle(p28,p30,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        //------------------------------------------\n        dstTriangle = Triangle(pos2,pos45,pos46);\n        srcTriangle = Triangle(p2,p45,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos2,pos44,pos45);\n        srcTriangle = Triangle(p2,p44,p45);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos2,pos43,pos44);\n        srcTriangle = Triangle(p2,p43,p44);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos30,pos45,pos46);\n        srcTriangle = Triangle(p30,p45,p46);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos30,pos44,pos45);\n        srcTriangle = Triangle(p30,p44,p45);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        dstTriangle = Triangle(pos30,pos43,pos44);\n        srcTriangle = Triangle(p30,p43,p44);\n        condition=judgePointInTriangleOrNot(curPoint,dstTriangle);\n        if (condition > 0.8) {\n            sampleCoordinate = triangleTransform(curPoint,dstTriangle,srcTriangle);\n            sampleColor = texture2D(inputImageTexture2, sampleCoordinate);\n        }\n\n        vec2 targetPoint = curPoint - vMove;\n        targetPoint = (targetPoint-mouthCenter)*scale+mouthCenter;\n\n        //shader 被iOS改过，坐标跟我们是反的\n        vec4 findColor = texture2D(inputImageTexture, vec2(targetPoint.x, 1.0 - targetPoint.y));\n\n        vec2 resultCoord        = textureCoordinate;\n        vec2 x_y_proportion     = vec2(surfaceWidth,surfaceHeight);\n        if(0.0==surfaceWidth||0.0==surfaceHeight)\n            x_y_proportion     = vec2(x_a,y_a);\n\n        gl_FragColor = mix(originColor, findColor, sampleColor.a);\n    }\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.maskTextureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture2");
        this.matrixLocation1 = GLES20.glGetUniformLocation(this.programHandle, "matrixOne");
        this.matrixLocation2 = GLES20.glGetUniformLocation(this.programHandle, "matrixTwo");
        this.matrixLocation3 = GLES20.glGetUniformLocation(this.programHandle, "matrixThree");
        this.texSizeHandle = GLES20.glGetUniformLocation(this.programHandle, "texSize");
        this.landMaskHandle = GLES20.glGetUniformLocation(this.programHandle, "isLandMask");
    }

    @Override // p149l.AbstractC17477i4, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (this.maskTexture == 0 && !TextUtils.isEmpty(this.maskImagePath)) {
            this.maskTexture = lgm.m149781a(lgm.m149783c(this.maskImagePath));
        }
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || pjwVar.m169950n() == 0) {
            GLES20.glUniform1f(this.landMaskHandle, 0.0f);
            return;
        }
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.maskTexture);
        GLES20.glUniform1i(this.maskTextureHandle, 1);
        float[] fArrM220019m = this.mmcvInfo.m169946j(0).m220019m();
        this.locationList.get(0).set(fArrM220019m[17], fArrM220019m[113]);
        this.locationList.get(1).set(fArrM220019m[16], fArrM220019m[112]);
        this.locationList.get(2).set(fArrM220019m[15], fArrM220019m[111]);
        this.locationList.get(3).set(fArrM220019m[14], fArrM220019m[110]);
        this.locationList.get(4).set(fArrM220019m[12], fArrM220019m[108]);
        this.locationList.get(5).set(fArrM220019m[11], fArrM220019m[107]);
        this.locationList.get(6).set(fArrM220019m[10], fArrM220019m[106]);
        this.locationList.get(7).set(fArrM220019m[9], fArrM220019m[105]);
        this.locationList.get(8).set(fArrM220019m[8], fArrM220019m[104]);
        this.locationList.get(9).set(fArrM220019m[7], fArrM220019m[103]);
        this.locationList.get(10).set(fArrM220019m[6], fArrM220019m[102]);
        this.locationList.get(11).set(fArrM220019m[4], fArrM220019m[100]);
        this.locationList.get(12).set(fArrM220019m[3], fArrM220019m[99]);
        this.locationList.get(13).set(fArrM220019m[2], fArrM220019m[98]);
        this.locationList.get(14).set(fArrM220019m[1], fArrM220019m[97]);
        PointF pointF = new PointF(fArrM220019m[24], fArrM220019m[120]);
        PointF pointF2 = new PointF(fArrM220019m[29], fArrM220019m[125]);
        PointF pointF3 = new PointF(fArrM220019m[63], fArrM220019m[159]);
        PointF pointF4 = new PointF(fArrM220019m[74], fArrM220019m[170]);
        this.locationList.get(15).set((((pointF.x + pointF2.x) + pointF3.x) + pointF4.x) / 4.0f, (((pointF.y + pointF2.y) + pointF3.y) + pointF4.y) / 4.0f);
        this.locationList.get(16).set((pointF3.x + pointF4.x) / 2.0f, (pointF3.y + pointF4.y) / 2.0f);
        PointF pointF5 = new PointF(fArrM220019m[64], fArrM220019m[160]);
        PointF pointF6 = new PointF(fArrM220019m[73], fArrM220019m[169]);
        this.locationList.get(17).set((pointF5.x + pointF6.x) / 2.0f, (pointF5.y + pointF6.y) / 2.0f);
        this.locationList.get(18).set(fArrM220019m[75], fArrM220019m[171]);
        PointF pointF7 = new PointF(fArrM220019m[51], fArrM220019m[147]);
        PointF pointF8 = new PointF(fArrM220019m[54], fArrM220019m[150]);
        PointF pointF9 = new PointF(fArrM220019m[57], fArrM220019m[153]);
        PointF pointF10 = new PointF(fArrM220019m[60], fArrM220019m[156]);
        this.locationList.get(19).set((((pointF7.x + pointF8.x) + pointF9.x) + pointF10.x) / 4.0f, (((pointF7.y + pointF8.y) + pointF9.y) + pointF10.y) / 4.0f);
        PointF pointF11 = new PointF(fArrM220019m[39], fArrM220019m[135]);
        PointF pointF12 = new PointF(fArrM220019m[42], fArrM220019m[138]);
        PointF pointF13 = new PointF(fArrM220019m[45], fArrM220019m[141]);
        PointF pointF14 = new PointF(fArrM220019m[48], fArrM220019m[144]);
        this.locationList.get(20).set((((pointF11.x + pointF12.x) + pointF13.x) + pointF14.x) / 4.0f, (((pointF11.y + pointF12.y) + pointF13.y) + pointF14.y) / 4.0f);
        this.locationList.get(21).set(fArrM220019m[82], fArrM220019m[178]);
        this.locationList.get(22).set(fArrM220019m[76], fArrM220019m[172]);
        this.locationList.get(23).set(fArrM220019m[79], fArrM220019m[175]);
        this.locationList.get(24).set(fArrM220019m[90], fArrM220019m[186]);
        this.locationList.get(25).set(fArrM220019m[94], fArrM220019m[190]);
        float width = getWidth();
        float height = getHeight();
        float[] fArr = {this.locationList.get(0).x / width, this.locationList.get(0).y / height, this.locationList.get(1).x / width, this.locationList.get(1).y / height, this.locationList.get(2).x / width, this.locationList.get(2).y / height, this.locationList.get(3).x / width, this.locationList.get(3).y / height, this.locationList.get(4).x / width, this.locationList.get(4).y / height, this.locationList.get(5).x / width, this.locationList.get(5).y / height, this.locationList.get(6).x / width, this.locationList.get(6).y / height, this.locationList.get(7).x / width, this.locationList.get(7).y / height};
        float[] fArr2 = {this.locationList.get(8).x / width, this.locationList.get(8).y / height, this.locationList.get(9).x / width, this.locationList.get(9).y / height, this.locationList.get(10).x / width, this.locationList.get(10).y / height, this.locationList.get(11).x / width, this.locationList.get(11).y / height, this.locationList.get(12).x / width, this.locationList.get(12).y / height, this.locationList.get(13).x / width, this.locationList.get(13).y / height, this.locationList.get(14).x / width, this.locationList.get(14).y / height, this.locationList.get(15).x / width, this.locationList.get(15).y / height};
        float[] fArr3 = {this.locationList.get(16).x / width, this.locationList.get(16).y / height, this.locationList.get(17).x / width, this.locationList.get(17).y / height, this.locationList.get(18).x / width, this.locationList.get(18).y / height, this.locationList.get(23).x / width, this.locationList.get(23).y / height, this.locationList.get(24).x / width, this.locationList.get(24).y / height, this.locationList.get(25).x / width, this.locationList.get(25).y / height, 0.0f, 0.0f, 0.0f, 0.0f};
        GLES20.glUniformMatrix4fv(this.matrixLocation1, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.matrixLocation2, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.matrixLocation3, 1, false, fArr3, 0);
        GLES20.glUniform2f(this.texSizeHandle, width, height);
        GLES20.glUniform1f(this.landMaskHandle, 1.0f);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        deleteTexture();
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.maskImagePath = filterOptions.getFolder() + File.separator + "mask.png";
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
    }
}
