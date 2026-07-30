package com.alibaba.fastjson.asm;

import org.spongycastle.crypto.tls.CipherSuite;
import p153l.l710;

/* JADX INFO: loaded from: classes.dex */
public class MethodWriter implements MethodVisitor {
    private int access;
    private ByteVector code = new ByteVector();

    /* JADX INFO: renamed from: cw */
    final ClassWriter f3871cw;
    private final int desc;
    int exceptionCount;
    int[] exceptions;
    private int maxLocals;
    private int maxStack;
    private final int name;
    MethodWriter next;

    public MethodWriter(ClassWriter classWriter, int i, String str, String str2, String str3, String[] strArr) {
        if (classWriter.firstMethod == null) {
            classWriter.firstMethod = this;
        } else {
            classWriter.lastMethod.next = this;
        }
        classWriter.lastMethod = this;
        this.f3871cw = classWriter;
        this.access = i;
        this.name = classWriter.newUTF8(str);
        this.desc = classWriter.newUTF8(str2);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.exceptionCount = length;
        this.exceptions = new int[length];
        for (int i2 = 0; i2 < this.exceptionCount; i2++) {
            this.exceptions[i2] = classWriter.newClassItem(strArr[i2]).index;
        }
    }

    public final int getSize() {
        int i;
        if (this.code.length > 0) {
            this.f3871cw.newUTF8("Code");
            i = this.code.length + 26;
        } else {
            i = 8;
        }
        if (this.exceptionCount <= 0) {
            return i;
        }
        this.f3871cw.newUTF8("Exceptions");
        return i + (this.exceptionCount * 2) + 8;
    }

    public final void put(ByteVector byteVector) {
        byteVector.putShort(this.access & (-393217)).putShort(this.name).putShort(this.desc);
        int i = this.code.length > 0 ? 1 : 0;
        if (this.exceptionCount > 0) {
            i++;
        }
        byteVector.putShort(i);
        int i2 = this.code.length;
        if (i2 > 0) {
            byteVector.putShort(this.f3871cw.newUTF8("Code")).putInt(i2 + 12);
            byteVector.putShort(this.maxStack).putShort(this.maxLocals);
            ByteVector byteVectorPutInt = byteVector.putInt(this.code.length);
            ByteVector byteVector2 = this.code;
            byteVectorPutInt.putByteArray(byteVector2.data, 0, byteVector2.length);
            byteVector.putShort(0);
            byteVector.putShort(0);
        }
        if (this.exceptionCount > 0) {
            byteVector.putShort(this.f3871cw.newUTF8("Exceptions")).putInt((this.exceptionCount * 2) + 2);
            byteVector.putShort(this.exceptionCount);
            for (int i3 = 0; i3 < this.exceptionCount; i3++) {
                byteVector.putShort(this.exceptions[i3]);
            }
        }
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitEnd() {
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        this.code.put12(i, this.f3871cw.newFieldItem(str, str2, str3).index);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        this.code.putByte(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA).put11(i, i2);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitInsn(int i) {
        this.code.putByte(i);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.code.put11(i, i2);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        if ((label.status & 2) != 0 && label.position - this.code.length < -32768) {
            l710.m153113a();
            return;
        }
        this.code.putByte(i);
        ByteVector byteVector = this.code;
        label.put(this, byteVector, byteVector.length - 1);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitLabel(Label label) {
        ByteVector byteVector = this.code;
        label.resolve(this, byteVector.length, byteVector.data);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        Item itemNewConstItem = this.f3871cw.newConstItem(obj);
        int i = itemNewConstItem.index;
        int i2 = itemNewConstItem.type;
        if (i2 == 5 || i2 == 6) {
            this.code.put12(20, i);
            return;
        }
        ByteVector byteVector = this.code;
        if (i >= 256) {
            byteVector.put12(19, i);
        } else {
            byteVector.put11(18, i);
        }
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        this.maxStack = i;
        this.maxLocals = i2;
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        boolean z = i == 185;
        Item itemNewMethodItem = this.f3871cw.newMethodItem(str, str2, str3, z);
        int argumentsAndReturnSizes = itemNewMethodItem.intVal;
        if (!z) {
            this.code.put12(i, itemNewMethodItem.index);
            return;
        }
        if (argumentsAndReturnSizes == 0) {
            argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
            itemNewMethodItem.intVal = argumentsAndReturnSizes;
        }
        this.code.put12(185, itemNewMethodItem.index).put11(argumentsAndReturnSizes >> 2, 0);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.code.put12(i, this.f3871cw.newClassItem(str).index);
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        if (i2 < 4 && i != 169) {
            this.code.putByte((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
            return;
        }
        ByteVector byteVector = this.code;
        if (i2 >= 256) {
            byteVector.putByte(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256).put12(i, i2);
        } else {
            byteVector.put11(i, i2);
        }
    }
}
