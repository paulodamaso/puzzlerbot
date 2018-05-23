/*
 * MIT License
 *
 * Copyright (c) 2018 Kapralov Sergey
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.github.skapral.puzzler.app;

import com.github.skapral.puzzler.config.Cp_PORT;
import com.github.skapral.puzzler.web.SrvGrizzlyWithJersey;
import com.github.skapral.puzzler.web.jersey.PuzzlerAPI;
import oo.atom.anno.NotAtom;

/**
 * Starting point.
 *
 * @author Kapralov Sergey
 */
@NotAtom
public class Bootstrap {
    /**
     * Main.
     *
     * @param args CLI args.
     * @throws Exception If something went wrong.
     */
    public final static void main(String... args) throws Exception {
        new SrvGrizzlyWithJersey(
            new Cp_PORT(),
            new PuzzlerAPI()
        ).start();
    }
}